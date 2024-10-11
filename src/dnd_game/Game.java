package dnd_game;

import dnd_game.personnage.Guerrier;
import dnd_game.personnage.Magicien;
import dnd_game.personnage.Pangolin;
import dnd_game.personnage.Personnage;
import dnd_game.plateau.Case;
import dnd_game.plateau.PersonnageHorsPlateauException;
import dnd_game.plateau.Plateau;

import java.util.ArrayList;
import java.util.Random;

public class Game {

    private Plateau board;
    private Menu menu;
    private Personnage player;
    private ArrayList<Case> boardList;

    public Game() {
        this.board = new Plateau();
        this.menu = new Menu();
        this.player = this.characterCreation();
    }

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


    public void startIteration4Game() {
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
                    playIteration4Game();
                    break;
            }
            playerChoice = menu.displayStartMenu();
        }

        menu.displayGameOver(player.getName());

    }

    private void playIteration4Game() {

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
                playerPosition = moveCharacterOnIteration4Board(playerPosition, diceRoll);

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
        int playerChoice = menu.displayEndChoice();

        if (playerChoice == 2) {
            menu.displayGameOver(player.getName());
            System.exit(0);
        }

    }

    public int moveCharacterOnIteration4Board(int playerPosition, int diceRoll) throws PersonnageHorsPlateauException {

        playerPosition = playerPosition + diceRoll;

        //vérifier si position ne dépasse pas la longueur du board
        if (playerPosition > board.size()) {
            throw new PersonnageHorsPlateauException();
        } else {
            Case currentCase = board.getCase(playerPosition);
            //indique la nouvelle position du joueur
            menu.displayPlayerPositionOnIteration4Board(playerPosition, currentCase);
            //récupère objet éventuellement
            currentCase.interaction(player);
        }

        return playerPosition;
    }


    public int rollDice() {
        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1;

        return diceRoll;
    }



}
