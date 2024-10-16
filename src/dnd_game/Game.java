package dnd_game;

import dnd_game.equipement.offensif.EquipementOffensif;
import dnd_game.equipement.offensif.armes.Arme;
import dnd_game.equipement.offensif.sorts.Sort;
import dnd_game.personnage.Guerrier;
import dnd_game.personnage.Magicien;
import dnd_game.personnage.Pangolin;
import dnd_game.personnage.Personnage;
import dnd_game.personnage.ennemi.Ennemi;
import dnd_game.plateau.*;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 * The {@code Game} class manages the entire flow of the game, from character
 * creation to handling interactions on the game board.
 * The {@code Game} class also handles restarting or quitting the game based on
 * player choices.
 * <p>
 * It plays the role of the Game Master, directing the player through different
 * phases such as dice rolling, moving on the board, fighting enemies, and
 * interacting with equipment.
 * </p>
 */
public class Game {

    private Plateau board;
    private Menu menu;
    private Personnage player;
    private ArrayList<Case> boardList;

    /**
     * Initializes a new game by creating the board and setting up the player
     * character via the {@code characterCreation} method.
     */
    public Game() {
        this.board = new Plateau();
        this.menu = new Menu();
        this.player = this.characterCreation();
    }

    /**
     * Handles the creation of the player character by asking the player
     * for their character type and name.
     *
     * @return the player character, either a Warrior, a Wizard, or a Pangolin.
     */
    public Personnage characterCreation() {

        int characterType = menu.askCharacterType();

        String characterName = menu.askCharacterName();

        Personnage character;

        switch (characterType) {
            case 1:
                character = new Guerrier(characterName);
                break;
            case 2:
                character = new Magicien(characterName);
                break;
            default:
                character = new Pangolin(characterName);
                break;
        }
        return character;
    }

    /**
     * Starts the main menu where the player can choose to view character info,
     * modify their character, start the game, or quit.
     */
    public void startGame() {
        menu = new Menu();

        int playerChoice = menu.displayStartMenu();

        while (playerChoice != 4) {
            switch (playerChoice) {
                case 1:
                    menu.displayCharacterInfo(player);
                    break;
                case 2:
                    player = characterCreation();
                    break;
                case 3:
                    menu.displayBeginning();
                    playGame();
                    break;
            }
            playerChoice = menu.displayStartMenu();
        }

        menu.displayGameOver(player.getName());

    }

    /**
     * Manages the main game loop where the player rolls the dice, moves across the board,
     * and interacts with the cases on the board. It checks if the player reaches the end of the board.
     */
    private void playGame() {

        //position du joueur initiale en case 1
        int playerPosition = 0;
        menu.displayPlayerPositionOnIteration4Board(playerPosition, board.getCase(playerPosition));

        //boucle de jeu tant que joueur est pas arrivé à case 4
        while (playerPosition < board.size()) {
            //demande au joueur de lancer le dé
            int playerInput = menu.askBeforeNewDiceRoll(player.getName());

            while (playerInput != 1) {
                playerInput = menu.askBeforeNewDiceRoll(player.getName());
            }

            try {
                //lance le dé
                int diceRoll = rollDice();
                //affiche le dé
                menu.displayDiceRoll(diceRoll);

                //avance le joueur sur le plateau
                playerPosition = moveCharacterOnBoard(playerPosition, diceRoll);

            } catch (PersonnageHorsPlateauException e) {
                //si le joueur dépasse du plateau, afficher message
                System.out.println(e.getMessage());
                //et sort de la boucle
                break;
            }
        }

        // si position >= 4, gagné
        menu.displayEnd(player.getName());

        //choix entre recommencer ou quitter
        restartGameOrQuit();
    }

    /**
     * Handles the decision to restart or quit the game at the end.
     */
    public void restartGameOrQuit() {
        int playerChoice = menu.displayEndChoice();

        if (playerChoice == 2) {
            menu.displayGameOver(player.getName());
            System.exit(0);
        }
    }

    /**
     * Checks if the player is still alive after an interaction or combat.
     * If the player dies, it ends the game; otherwise, it displays the remaining HP.
     */
    public void verifyIfPlayerSurvives() {
        if (player.isDead()) {
            menu.displayPlayerDeath(player.getName());
            restartGameOrQuit();
        } else {
            menu.displayPlayerHP(player.getHP(), player.getName());
        }
    }

    /**
     * Moves the player on the board based on the dice roll and triggers
     * the interaction with the current case.
     *
     * @param playerPosition the current position of the player on the board.
     * @param diceRoll the result of the dice roll.
     * @return the new position of the player on the board.
     * @throws PersonnageHorsPlateauException if the player moves outside the board.
     */
    public int moveCharacterOnBoard(int playerPosition, int diceRoll) throws PersonnageHorsPlateauException {

        playerPosition = playerPosition + diceRoll;

        //vérifier si position ne dépasse pas la longueur du board
        if (playerPosition > board.size()) {
            throw new PersonnageHorsPlateauException();
        } else {
            Case currentCase = board.getCase(playerPosition);

            playerInteractsWithBoard(playerPosition, currentCase);

        }
        return playerPosition;
    }

    /**
     * Manages the player's interaction with the current case on the board.
     * This can involve combat with enemies, picking up equipment, or other interactions.
     *
     * @param playerPosition the position of the player on the board.
     * @param currentCase the current case on the board.
     * @throws PersonnageHorsPlateauException if the player moves outside the board.
     */
    public void playerInteractsWithBoard(int playerPosition, Case currentCase) throws PersonnageHorsPlateauException {
        menu.displayPlayerPositionOnIteration4Board(playerPosition, currentCase);

        currentCase.interaction(player);
        if (currentCase instanceof Ennemi) {
            menu.displayEnemyAttack(((Ennemi) currentCase).getName(), player.getName(), ((Ennemi) currentCase).getStrength(), player.getDefensiveEquipmentName(), player.getDefenseBonus());
            playerFight((Ennemi) currentCase);
            verifyIfPlayerSurvives();
        }
        if (currentCase instanceof EquipementOffensif) {
            playerGetsOffensiveEquipment((EquipementOffensif) currentCase);
        }
        if(currentCase instanceof Potion){
            menu.displayPotionInteraction(player.getName(), ((Potion) currentCase).getHealthBonus());
            menu.displayPlayerHP(player.getHP(), player.getName());
        }
        if (currentCase instanceof CaseVide){
            menu.displayNothingHappens();
        }
    }

    /**
     * Handles the combat between the player and an enemy.
     * The player attacks the enemy, and based on the outcome, either defeats the enemy or the enemy flees.
     *
     * @param enemy the enemy that the player is fighting.
     */
    public void playerFight(Ennemi enemy) {
        player.attackEnemy(enemy);
        menu.displayPlayerAttack(player.getName(), enemy.getName(), player.getTotalStrength());
        if (enemy.isDead()) {
            menu.displayVictory(enemy.getName());
        } else {
            menu.displayEnemyFlight(enemy.getName());
        }
    }


    /**
     * Handles the interaction where the player acquires offensive equipment.
     * Based on the type of equipment, it either equips the player with a weapon or a spell.
     *
     * @param offensiveEquipment the offensive equipment found by the player.
     */
    public void playerGetsOffensiveEquipment(EquipementOffensif offensiveEquipment) {
        if (offensiveEquipment instanceof Arme) {
            warriorGetsWeapon((Arme) offensiveEquipment);
        }
        if (offensiveEquipment instanceof Sort) {
            wizardGetsSpell((Sort) offensiveEquipment);
        }
    }

    /**
     * Handles the scenario where a warrior character finds a weapon.
     * The warrior can equip the weapon if they don't already have it, otherwise it displays a message.
     *
     * @param weapon the weapon found by the warrior.
     */
    public void warriorGetsWeapon(Arme weapon) {
        if (player instanceof Guerrier) {
            menu.displayOffensiveEquipmentInteraction(player.getName(), weapon.toString(), weapon.getStrengthBonus(), player.getTotalStrength());
        } else if (player instanceof Guerrier || Objects.equals(weapon.getName(), player.getOffensiveEquipmentName())) {
            menu.displayPlayerIsAlreadyEquippedByThisItem(player.getName(), weapon.getName());
        } else {
            menu.displayNonValidEquipment(player.getName(), player.getType(), weapon.toString());
        }
    }

    /**
     * Handles the scenario where a wizard character finds a spell.
     * The wizard can equip the spell if they don't already have it.
     *
     * @param spell the spell found by the wizard.
     */
    public void wizardGetsSpell(Sort spell) {
        if (player instanceof Magicien) {
            menu.displayOffensiveEquipmentInteraction(player.getName(), spell.toString(), spell.getStrengthBonus(), player.getTotalStrength());
        } else {
            menu.displayNonValidEquipment(player.getName(), player.getType(), spell.toString());
        }
    }

    /**
     * Simulates the rolling of a dice for determining player movement.
     * Generates a random number between 1 and 6 (inclusive).
     *
     * @return the result of the dice roll (between 1 and 6).
     */
    public int rollDice() {
        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1;

        return diceRoll;
    }

}
