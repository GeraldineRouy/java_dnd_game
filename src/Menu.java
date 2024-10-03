import java.util.Scanner;

public class Menu {
    String askCharacterType() {
        Scanner typeChoice = new Scanner( System.in );
        int input;
        String characterType;

        System.out.println("Choisissez votre type d'aventurier : 1 pour guerrier, 2 pour magicien : ");
        input = typeChoice.nextInt();

        if (input == 1) {
            System.out.println("Vous avez choisi d'incarner un guerrier !");
            characterType = Personnage.GUERRIER;
        }
        else if (input == 2) {
            System.out.println("Vous avez choisi d'incarner un magicien !");
            characterType = Personnage.MAGICIEN;
        } else {
            characterType = "bouseux";
        }
        return characterType;
    }

    String askCharacterName() {
        Scanner nameChoice = new Scanner( System.in );
        String characterName;

        System.out.println("Quel est le nom de votre aventurier?");
        characterName = nameChoice.nextLine();

        return characterName;
    }

    int askToDisplayInfosOrModifyCharacter() {
        Scanner choice = new Scanner( System.in );
        int input;

        System.out.println("Que souhaitez-vous faire? " +
                "\n 1 : Afficher les infos du personnage" +
                "\n 2 : Modifier votre personnage" +
                "\n 3 : Quitter le jeu");
        input = choice.nextInt();

        return input;
    }

    Personnage displayInfosOrModifyCharacter(int input, String type, String name) {
        if (input == 1){
            System.out.println("Votre avatar s'appelle "+ name + " et c'est un " + type + ".");
        } else if (input == 2) {
            type = askCharacterType();
            name = askCharacterName();
            int playerChoice = this.askToDisplayInfosOrModifyCharacter();
            displayInfosOrModifyCharacter(playerChoice, type, name);
        } else {
            System.out.println("A bientôt !");
        }
        Personnage player = new Personnage(type, name);
        return player;
    }


}
