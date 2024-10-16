package dnd_game.equipement.defensif;

import dnd_game.personnage.Guerrier;
import dnd_game.personnage.Personnage;

/**
 * The {@code Bouclier} class represents a shield, which is a type of
 * defensive equipment that provides a defense bonus to warriors.
 * This class extends the {@code EquipementDefensif} class and
 * initializes the shield's specific attributes such as its name
 * and defense bonus.
 */
public class Bouclier extends EquipementDefensif {

    public static final String BOUCLIER = "bouclier";

    /**
     * Constructs a new instance of {@code Bouclier}.
     * Initializes the name of the shield and sets its defense bonus.
     */
    public Bouclier() {
        name = BOUCLIER;
        defenseBonus = 2;
    }

    /**
     * Defines the interaction of the shield with a character.
     * Currently, this method does not implement any functionality.
     *
     * @param player the character with whom the shield interacts.
     */
    @Override
    public void interaction(Personnage player) {
        // Interaction logic can be implemented here
    }
}
