//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String characterType;
        String characterName;
        int playerChoice;

        Menu menu = new Menu();
        characterType = menu.askCharacterType();

        characterName = menu.askCharacterName();

        Personnage player = new Personnage(characterType, characterName);

        playerChoice = menu.askToDisplayInfosOrModifyCharacter();

        player = menu.displayInfosOrModifyCharacter(playerChoice, player.getType(), player.getName());

    }
}