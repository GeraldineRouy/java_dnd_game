import java.util.Random;

public class Game {
    Personnage player1;
    Menu menu;

    public Game() {
        menu = new Menu();


        startGame();

    }

    public Personnage characterCreation() {
        menu.displayStarLine();

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

    public void startGame() {
        Personnage player = characterCreation();

        menu.displayStarLine();

        int playerChoice = menu.displayMenu();

        while (playerChoice != 4) {

            if (playerChoice == 1) {
                menu.displayCharacterInfo(player);
            } else if (playerChoice == 2) {
                player = characterCreation();
            } else if (playerChoice == 3) {
                menu.displayBeginning();
                playGame(player);
            }

            playerChoice = menu.displayMenu();
        }

        menu.displayStarLine();
        System.out.println("A bientôt !");

    }

    public int rollDice() {
        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1;

        return diceRoll;
    }

    public void playGame(Personnage player) {
        //position initiale en case 1
        int playerPosition = 1;

        //vérifie sa position
        //si position - de 64 , relance le dé
        while (playerPosition != 64) {
            menu.displayStarLine();

            //lance le dé
            int diceRoll = rollDice();
            //affiche le dé
            menu.displayDiceRoll(diceRoll);

            //avance le joueur
            playerPosition = playerPosition + diceRoll;

            //si position + de 64, le joueur recule
            if (playerPosition > 64) {
                System.out.println("Oh non ! Vous avez dépassé la case 64!");
                int stepBack = playerPosition - 64;
                playerPosition = 64 - stepBack;

            }
            // le menu indique la position du joueur
            menu.displayPlayerPosition(playerPosition);

        }
        menu.displayStarLine();

        // si position = 64, gagné
        menu.displayEnd(player.getName());

        //choix entre recommencer ou quitter
        menu.displayStarLine();
        int playerChoice = menu.displayEndChoice();

        if (playerChoice == 2) {
            menu.displayStarLine();
            System.out.println("A bientôt !");
            System.exit(0);
        }

    }


}
