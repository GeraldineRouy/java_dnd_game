package dnd_game.equipement.defensif;

import dnd_game.personnage.Magicien;
import dnd_game.personnage.Personnage;

/**
 * The {@code Philtre} class represents a potion that provides a
 * defense bonus to magicians in the game. This class extends
 * the {@code EquipementDefensif} class and initializes the
 * potion's specific attributes such as its name and defense bonus.
 */
public class Philtre extends EquipementDefensif {

    public static final String PHILTRE = "Philtre";

    /**
     * Constructs a new instance of {@code Philtre}.
     * Initializes the name of the potion and sets its defense bonus.
     */
    public Philtre(){
        name = PHILTRE;
        defenseBonus = 3;
    }

    /**
     * Defines the interaction of the potion with a character.
     * Currently, this method does not implement any functionality.
     *
     * @param player the character with whom the potion interacts.
     */
    @Override
    public void interaction(Personnage player) {
        // Interaction logic can be implemented here
    }
}
