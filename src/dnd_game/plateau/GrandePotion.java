package dnd_game.plateau;

import dnd_game.personnage.Personnage;

/**
 * The {@code GrandePotion} class represents a large potion in the game that
 * restores a significant amount of health to the player. This class extends the
 * {@code Potion} class and provides a higher health bonus compared to a regular potion.
 */
public class GrandePotion extends Potion implements Case {

    public static final String GRANDEPOTION = "grande potion";

    /**
     * Constructs a {@code GrandePotion} object with predefined name and health bonus.
     * The health bonus for a large potion is set to 5.
     */
    public GrandePotion() {
        name = GRANDEPOTION;
        healthBonus = 5;
    }

    /**
     * Returns a string representation of the {@code GrandePotion}.
     *
     * @return a string representing "grande potion".
     */
    @Override
    public String toString() {
        return GRANDEPOTION;
    }

}
