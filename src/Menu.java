import java.util.Scanner;

public class Menu {

    public Menu() {

    }

    public String askCharacterType() {
        Scanner typeChoice = new Scanner(System.in);
        Integer input;
        String characterType;

        System.out.println("Bienvenue, aventurier !\n" +
                "\nQue souhaitez-vous incarner?" +
                "\n 1 : un guerrier" +
                "\n 2 : un magicien");

        input = typeChoice.nextInt();

        if (input == 1) {
            System.out.println("Vous avez choisi d'incarner un guerrier !");
            characterType = Personnage.GUERRIER;
        } else if (input == 2) {
            System.out.println("Vous avez choisi d'incarner un magicien !");
            characterType = Personnage.MAGICIEN;
        } else {
            System.out.println("Pas envie d'être un magicien ni un guerrier? Vous serez donc un pangolin!!!");
            characterType = Personnage.PANGOLIN;
        }
        return characterType;
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
        System.out.println("C'est parti ! Vous démarrez à la case 1.");
    }

    public void displayDiceRoll (int result) {
        System.out.println("Vous lancez le dé ..." +
                "\n ... et vous obtenez " + result + " !" +
                "\nVous avancez donc de " + result + " case(s).");
    }

    public void displayPlayerPosition (int playerPosition) {
        System.out.println("Vous êtes en case " + playerPosition + ".");
    }

    public void displayEnd (String playerName) {
        System.out.println("Félicitations " + playerName + " !" +
                "\n \\o/ Vous êtes arrivé sur la case 64, vous avez terminé le jeu !!! \\o/");
    }

    public int displayEndChoice () {
        Scanner playerChoice = new Scanner(System.in);
        int input;

        System.out.println("Que souhaitez-vous faire?" +
                "\n 1 : Refaire une partie" +
                "\n 2 : Quitter le jeu");
        input = playerChoice.nextInt();

        return input;
    }

    public void displayStarLine() {
        System.out.println("****************************************");
    }


}
