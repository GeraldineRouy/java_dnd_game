package dnd_game.personnage.ennemi;

import dnd_game.Menu;
import dnd_game.personnage.Personnage;
import dnd_game.plateau.Case;

public class Dragon extends Ennemi{

    public static final String DRAGON = "dragon";

    public Dragon() {
        name = DRAGON;
        healthPoints = 15;
        strengthPoints = 4;
    }
}
