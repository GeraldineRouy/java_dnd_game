public class Game {
    Personnage player1 ;
    Menu menu;

    public Game() {
        menu = new Menu();
        player1 = characterCreation();

        verifyOrModifyCharacterOrQuit(player1);

    }

    public Personnage characterCreation() {

        String characterType = menu.askCharacterType();

        String characterName = menu.askCharacterName();

        Personnage newPlayer = new Personnage(characterType, characterName);

        return newPlayer;
    }

    public void modifyCharacter(String characterType, String characterName) {
        player1.setCharacterType(characterType);
        player1.setCharacterName(characterName);
        player1.defineSpecsByCharacterType();
    }

    public void verifyOrModifyCharacterOrQuit(Personnage player) {

        int playerChoice = menu.askToDisplayInfosOrModifyCharacter();

       while (playerChoice != 3 ) {

           if (playerChoice == 1) {
               menu.displayCharacterInfo(player);
           } else if (playerChoice == 2) {
               String player1Type = menu.askCharacterType();
               String player1Name = menu.askCharacterName();
               modifyCharacter(player1Type, player1Name);
           }

           playerChoice = menu.askToDisplayInfosOrModifyCharacter();
       }

        System.out.println("A bientôt !");

    }


}
