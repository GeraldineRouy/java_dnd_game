package dnd_game.personnage.ennemi;

import dnd_game.personnage.Personnage;

/**
 * The {@code Sorcier} class represents a sorcerer enemy character in the game.
 * This class extends the {@code Ennemi} class and provides specific
 * attributes for sorcerer-type enemies, including health points and strength.
 */
public class Sorcier extends Ennemi{

    public static final String SORCIER = "sorcier";

    /**
     * Creates a new instance of {@code Sorcier} with default attributes.
     * Initializes the sorcerer's name, health points, and strength points.
     */
    public Sorcier() {
        name = SORCIER;
        healthPoints = 9;
        strengthPoints = 2;
    }
}
