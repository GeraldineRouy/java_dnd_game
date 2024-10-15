package dnd_game.personnage.ennemi;

import dnd_game.Menu;
import dnd_game.personnage.Personnage;

/**
 * The {@code Gobelin} class represents a goblin enemy character in the game.
 * This class extends the {@code Ennemi} class and provides specific
 * attributes for goblin-type enemies, including health points and strength.
 */
public class Gobelin extends Ennemi{

    public static final String GOBELIN = "gobelin";

    /**
     * Creates a new instance of {@code Gobelin} with default attributes.
     * Initializes the goblin's name, health points, and strength points.
     */
    public Gobelin() {
        name = GOBELIN;
        healthPoints = 6;
        strengthPoints = 1;
    }
}
