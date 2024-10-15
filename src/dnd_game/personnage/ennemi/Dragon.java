package dnd_game.personnage.ennemi;

import dnd_game.Menu;
import dnd_game.personnage.Personnage;
import dnd_game.plateau.Case;

/**
 * The {@code Dragon} class represents a dragon enemy character in the game.
 * This class extends the {@code Ennemi} class and provides specific
 * attributes for dragon-type enemies, including health points and strength.
 */
public class Dragon extends Ennemi{

    public static final String DRAGON = "dragon";

    /**
     * Creates a new instance of {@code Dragon} with default attributes.
     * Initializes the dragon's name, health points, and strength points.
     */
    public Dragon() {
        name = DRAGON;
        healthPoints = 15;
        strengthPoints = 4;
    }
}
