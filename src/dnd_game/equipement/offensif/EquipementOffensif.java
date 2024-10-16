package dnd_game.equipement.offensif;

import dnd_game.equipement.Equipement;
import dnd_game.personnage.Personnage;

/**
 * The {@code EquipementOffensif} class represents an offensive equipment in the game.
 * This abstract class extends the {@code Equipement} class and serves as the base for all offensive equipment types.
 * Offensive equipment provides an attack bonus to the player, contributing to their total strength.
 * <p>
 * Each offensive equipment has a type and a strength bonus, which are used to calculate the player's total attack power
 * during battles, depending on which type of character is played (warrior, magician or pangolin).
 * </p>
 */
public abstract class EquipementOffensif extends Equipement {

    protected String type;

    /** Bonus to the player's strength when this equipment is equipped. */
    protected int strengthBonus;

    public EquipementOffensif() {

    }

    /**
     * Returns a string representation of the offensive equipment.
     *
     * @return a string describing the equipment, including its type and strength bonus.
     */
    public String toString() {
        return "une " + type + ", attaque +" + strengthBonus;
    }

    /**
     * Gets the strength bonus provided by this offensive equipment.
     *
     * @return the strength bonus as an integer.
     */
    public int getStrengthBonus() {
        return strengthBonus;
    }
}
