package dnd_game.personnage;

import dnd_game.equipement.offensif.sorts.Sort;
import dnd_game.equipement.defensif.Philtre;

/**
 * The {@code Magicien} class represents a playable magician character in the game.
 * This class extends the {@code Personnage} class and provides specific
 * attributes and behaviors for magician-type characters, including
 * default health points, strength, and magical equipment.
 */
public class Magicien extends Personnage {
    public static final String MAGICIEN = "magicien";


    /**
     * Creates a new instance of {@code Magicien} with the specified name.
     * Initializes the magician's type to "magician", sets default health points,
     * strength, and assigns offensive and defensive magical equipment.
     *
     * @param name the name of the magician character.
     */
    public Magicien(String name) {
        super(name);
        type = MAGICIEN;
        setHP(3); // Sets default health points for a magician
        setStrength(8); // Sets default strength points for a magician
        offensiveEquipment = new Sort(); // Assigns offensive magical equipment
        defensiveEquipment = new Philtre(); // Assigns defensive magical equipment
    }

}
