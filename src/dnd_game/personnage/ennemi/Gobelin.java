package dnd_game.personnage.ennemi;

import dnd_game.Menu;
import dnd_game.personnage.Personnage;

public class Gobelin extends Ennemi{

    public static final String GOBELIN = "gobelin";

    public Gobelin() {
        name = GOBELIN;
        healthPoints = 6;
        strengthPoints = 1;
    }
}
