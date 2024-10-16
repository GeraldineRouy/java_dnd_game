package dnd_game;

import dnd_game.plateau.Case;
import dnd_game.personnage.Personnage;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The {@code Menu} class handles displaying instructions, messages, and
 * interactions to the player during the game. It provides various methods
 * to prompt the player for input, show game status, and narrate in-game events
 * like attacks, item pickups, and player movements on the board.
 *<p>
 * The class primarily serves as a user interface for interacting with the player
 * via the console. It is not responsible for game logic, but rather for
 * presenting information and handling input/output operations.
 * </p>
 */
public class Menu {

    public Menu() {

    }

    private void displayStarLine() {
        System.out.println("*************************************************");
    }

    public int askCharacterType() {
        Scanner typeChoice = new Scanner(System.in);
        int input;

        displayStarLine();

        System.out.println("""
                Bienvenue, aventurier !
                
                Que souhaitez-vous incarner?\
                
                 1 : un guerrier\
                
                 2 : un magicien""");

        input = typeChoice.nextInt();






        if (input == 1) {
            System.out.println("Vous avez choisi d'incarner un guerrier !");
        } else if (input == 2) {
            System.out.println("Vous avez choisi d'incarner un magicien !");
        } else {
            System.out.println("Pas envie d'être un magicien ni un guerrier? Vous serez donc un pangolin!!!");
        }
        return input;
    }

    public String askCharacterName() {
        Scanner nameChoice = new Scanner(System.in);
        String characterName;

        System.out.println("Quel est votre nom?");
        characterName = nameChoice.nextLine();

        return characterName;
    }

    public int displayStartMenu() {
        Scanner choice = new Scanner(System.in);
        int input;

        displayStarLine();

        System.out.println("Que souhaitez-vous faire? " +
                "\n 1 : Afficher les infos de mon aventurier" +
                "\n 2 : Modifier mon aventurier" +
                "\n 3 : Commencer l'aventure !" +
                "\n 4 : Quitter le jeu");
        try {
            input = choice.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Saisie non valide.");
            input = this.displayStartMenu();
        }


        return input;
    }

    public void displayCharacterInfo(Personnage player) {
        this.displayStarLine();
        System.out.println("Voici les informations concernant votre personnage :\n" + player.toString());
        this.displayStarLine();
    }

    public void displayBeginning() {
        displayStarLine();
        System.out.println("C'est parti ! Vous démarrez à la case 1.");
    }

    public void displayDiceRoll (int result) {
        displayStarLine();
        System.out.println("Vous lancez le dé ..." +
                "\n ... et vous obtenez " + result + " !" +
                "\nVous avancez donc de " + result + " case(s).");
    }


    public void displayPlayerPositionOnIteration4Board (int playerPosition, Case caseName) {
        displayStarLine();
        System.out.println("Vous êtes en case " + (playerPosition+1) + " : " + caseName.toString() + " !");
    }

    public void displayEnd (String playerName) {
        displayStarLine();
        System.out.println("Félicitations " + playerName + " !" +
                "\n \\o/ Vous êtes arrivé au bout du plateau, vous avez terminé le jeu !!! \\o/");
    }

    public int displayEndChoice () {
        Scanner playerChoice = new Scanner(System.in);
        int input;

        displayStarLine();

        System.out.println("Que souhaitez-vous faire?" +
                "\n 1 : Refaire une partie" +
                "\n 2 : Quitter le jeu");
        input = playerChoice.nextInt();

        return input;
    }

    public int askBeforeNewDiceRoll (String playerName) {
        Scanner choice = new Scanner(System.in);
        int input;

        displayStarLine();

        System.out.println("A vous de jouer " + playerName + " !" +
                "\nAppuyez sur 1 puis entrée pour relancer le dé.");
        input = choice.nextInt();

        return input;
    }

    public void displayGameOver (String playerName) {
        displayStarLine();
        System.out.println("A bientôt " + playerName + " !");
    }


    public void displayInteraction(String playerName, String item) {
        displayStarLine();
        System.out.println(playerName + " récupère l'objet " + item + " !");
    }


    public void displayPlayerCantTakeItem(String playerName, String playerType, String item) {
        System.out.println("Malheureusement " + playerName + " est un " + playerType + " et ne peut pas s'équiper de " + item + ".");
    }

    public void displayPlayerDeath(String playerName) {
        displayStarLine();
        System.out.println("Oh non ! " + playerName + " n'a pas survécu à l'attaque :-(" +
                "\n----- Fin de la partie ------" );
    }

    public void displayPlayerAttack(String playerName, String enemyName, int playerStrength) {
        System.out.println(playerName + " contre-attaque !  \n" +
                enemyName + " subit " + playerStrength + " points de dégat.");
    }

    public void displayPlayerHP(int playerHP, String playerName) {
        displayStarLine();
        System.out.println("Il reste " + playerHP + " points de vie à " + playerName + ".");
    }

    public void displayEnemyAttack (String enemyName, String playerName, int damage, String defensiveEquipmentName, int defenseBonus) {
        System.out.println("Attention ! le " + enemyName + " porte un coup à " + playerName + " !" +
                "\nCe dernier subit " + damage + " points de dégats, mais son " + defensiveEquipmentName + " en absorbe " + defenseBonus + ".");
    }

    public void displayVictory (String enemyName) {
        System.out.println("Victoire ! Le " + enemyName + " est vaincu !" );
    }

    public void displayOffensiveEquipmentInteraction (String playerName, String offensiveEquipmentName, int strengthBonus, int totalStrength) {
        System.out.println(playerName + " s'équipe avec " + offensiveEquipmentName
                + "\nSa force augmente de " + strengthBonus + " points et son niveau de force total est de " + totalStrength + ".");
    }

    public void displayNonValidEquipment (String playerName, String playerType, String EquipmentName) {
        System.out.println(playerName + " est un " + playerType + ", il ne peut pas s'équiper de " + EquipmentName + ".");
    }

    public void displayNothingHappens() {
        System.out.println("Une légère brise et des bruits lointains vous tiennent en alerte, mais rien ne se passe.");
    }

    public void displayPotionInteraction(String playerName, int healthBonus) {
        System.out.println("Super !!!" + playerName + " boit une potion qui lui donne " + healthBonus + "points de vie !");
    }

    public void displayPlayerIsAlreadyEquippedByThisItem (String playerName, String itemName) {
        System.out.println(playerName + " est déjà équipé avec " + itemName + ".");
    }

    public void displayEnemyFlight(String enemyName) {
        System.out.println(enemyName + " est blessé et prend la fuite !");
    }
}
