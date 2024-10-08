package DnDGame;

import DnDGame.Personnage.Guerrier;
import DnDGame.Personnage.Magicien;
import DnDGame.Personnage.Pangolin;
import DnDGame.Personnage.Personnage;
import DnDGame.Personnage.PersonnageHorsPlateauException;

import java.util.Arrays;
import java.util.Random;

public class Game {

    private int boardLength = 64;

    public Game(Menu menu) {

        startGame(menu, boardLength);

    }

    public String[] initializeBoard( int boardLength) {
        String[] board = new String[boardLength];
        Arrays.fill(board, "[]");
        return board;
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

    public void startGame(Menu menu, int boardLength) {
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
                    playGame(player, menu, boardLength);
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

    public void moveCharacterOnBoard(int oldPosition, int newPosition, String [] board, int boardLength) throws PersonnageHorsPlateauException {
        //Je vérifie si la nouvelle position du joueur ne dépasse pas la longueur de board
        if (newPosition >= boardLength) {
            throw new PersonnageHorsPlateauException("Le personnage dépasse la dernière case !");
        }

        board[oldPosition] = "[]";
        board[newPosition] = "[P]";
    }

    public void playGame(Personnage player, Menu menu, int boardLength) {
        //Création du plateau de jeu
        String [] board = initializeBoard(boardLength);

        //position initiale en case 1
        board[0] = "[P]";

        int oldPosition = 0;
        int newPosition = 0;

        //boucle de jeu tant que joueur est pas arrivé à case 64
        while (newPosition <= boardLength) {
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
                oldPosition = newPosition;
                newPosition = newPosition + diceRoll;
                moveCharacterOnBoard(oldPosition, newPosition, board, boardLength);

                //indique la nouvelle position du joueur
                menu.displayPlayerPosition(newPosition+1);

            } catch (PersonnageHorsPlateauException e) {
                //si le joueur dépasse du plateau, afficher message
                System.out.println(e.getMessage());
                //et sort de la boucle
                break;
            }

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
