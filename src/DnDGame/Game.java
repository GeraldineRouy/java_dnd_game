package DnDGame;

import DnDGame.Personnage.Guerrier;
import DnDGame.Personnage.Magicien;
import DnDGame.Personnage.Pangolin;
import DnDGame.Personnage.Personnage;

import java.util.Random;

public class Game {

    public Game(Menu menu) {


        startGame(menu);

    }

    public Personnage characterCreation(Menu menu) {
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

    public void startGame(Menu menu) {
        Personnage player = characterCreation(menu);

        menu.displayStarLine();

        int playerChoice = menu.displayMenu();

        while (playerChoice != 4) {
            switch (playerChoice) {
                case 1:
                    menu.displayCharacterInfo(player);
                    break;
                case 2:
                    player = characterCreation(menu);
                    break;
                case 3:
                    menu.displayBeginning();
                    playGame(player, menu);
                    break;
            }
            playerChoice = menu.displayMenu();
        }




        menu.displayStarLine();

        menu.displayGameOver(player.getName());

    }

    public int rollDice() {
        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1;

        return diceRoll;
    }

    public void playGame(Personnage player, Menu menu) {
        //position initiale en case 1
        int playerPosition = 1;

        //vérifie sa position
        //si position - de 64 , relance le dé
        while (playerPosition < 64) {
            menu.displayStarLine();

            //demande au joueur de lancer le dé
            int playerInput = menu.askBeforeNewDiceRoll(player.getName());

            while (playerInput != 1) {
                playerInput = menu.askBeforeNewDiceRoll(player.getName());
            }

            //lance le dé
            int diceRoll = rollDice();
            //affiche le dé
            menu.displayDiceRoll(diceRoll);

            //avance le joueur
            playerPosition = playerPosition + diceRoll;

            //indique la nouvelle position du joueur
            menu.displayPlayerPosition(playerPosition);

        }
        menu.displayStarLine();

        // si position >= 64, gagné
        menu.displayEnd(player.getName());

        //choix entre recommencer ou quitter
        menu.displayStarLine();
        int playerChoice = menu.displayEndChoice();

        if (playerChoice == 2) {
            menu.displayStarLine();
            menu.displayGameOver(player.getName());
            System.exit(0);
        }

    }


}
