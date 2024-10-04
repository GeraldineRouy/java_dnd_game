public class Game {
    Personnage player1 ;
    Menu player1Menu = new Menu();

    public Game() {
        player1 = characterCreation();
        verifyOrModifyCharacterOrQuit(player1);

    }

    public Personnage characterCreation() {

        String characterType = player1Menu.askCharacterType();

        String characterName = player1Menu.askCharacterName();

        Personnage player1 = new Personnage(characterType, characterName);
        return player1;
    }

    public void modifyCharacter(String characterType, String characterName) {
        player1.setCharacterType(characterType);
        player1.setCharacterName(characterName);
    }

    public void verifyOrModifyCharacterOrQuit(Personnage player1) {
        int player1Choice = player1Menu.askToDisplayInfosOrModifyCharacter();

        if (player1Choice == 1) {
            player1Menu.displayCharacterInfo(player1);
        } else if (player1Choice == 2) {
            String player1Type = player1Menu.askCharacterType();
            String player1Name = player1Menu.askCharacterName();
            modifyCharacter(player1Type, player1Name);

        } else if (player1Choice == 3) {
            //trouver comment terminer le jeu
        }

    }


}
