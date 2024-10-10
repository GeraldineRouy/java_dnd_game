package dnd_game;

import dnd_game.plateau.Case;
import dnd_game.personnage.Personnage;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public Menu() {

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

    public int displayMenu() {
        Scanner choice = new Scanner(System.in);
        int input;

        displayStarLine();

        System.out.println("Que souhaitez-vous faire? " +
                "\n 1 : Afficher les infos de mon aventurier" +
                "\n 2 : Modifier mon aventurier" +
                "\n 3 : Commencer l'aventure !" +
                "\n 4 : Quitter le jeu");
        input = choice.nextInt();

        return input;
    }

    public void displayCharacterInfo(Personnage player) {
        this.displayStarLine();
        System.out.println(player.toString());
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

    public void displayPlayerPosition (int playerPosition) {
        displayStarLine();
        System.out.println("Vous êtes en case " + playerPosition + ".");
    }

    public void displayPlayerPositionOnIteration4Board (int playerPosition, ArrayList<Case> board) {
        displayStarLine();
        System.out.println("Vous êtes en case " + (playerPosition+1) + " : " + board.get(playerPosition) + " !");
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

    private void displayStarLine() {
        System.out.println("*************************************************");
    }


}
