import java.util.Scanner;

public class Menu {
    void askCharacterType() {
        Scanner typeChoice = new Scanner( System.in );
        int input;

        System.out.println("Choisissez votre type d'aventurier : 1 pour guerrier, 2 pour mage : ");
        input = typeChoice.nextInt();

        if (input == 1) {
            System.out.println("Vous avez choisi d'incarner un/e  guerrier/e !");
        }
        else if (input == 2) {
            System.out.println("Vous avez choisi d'incarner un/e  magicien/ne !");
        }
    }
}
