package dnd_game.equipement.defensif;

import dnd_game.equipement.Equipement;

/**
 * The {@code EquipementDefensif} class represents a piece of defensive
 * equipment in the game. This class extends the {@code Equipement} class
 * and serves as an abstract base class for various types of defensive
 * equipment that provide a defense bonus to characters.
 * <p>
 * Each defensive equipment has a type and a defense bonus, which are used to calculate
 * the player's total defense during battles, depending on which type of character is played
 * (warrior, magician or pangolin).
 * </p>
 */
public abstract class EquipementDefensif extends Equipement {

    public static final String EQUIPEMENTDEFENSIF = "équipement défensif";

    protected String type;

    /**
     * The defense bonus provided by this equipment.
     */
    protected int defenseBonus;

    /**
     * Default constructor for the {@code EquipementDefensif} class.
     * Initializes the type of the defensive equipment.
     */
    public EquipementDefensif() {
        type = EQUIPEMENTDEFENSIF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the string representation of the defensive equipment,
     * including its name and defense bonus.
     *
     * @return a string describing the defensive equipment to be
     * displayed in game's menu and console.
     */
    public String toString() {
        return "un " + name + ", vie +" + defenseBonus;
    }

    public int getDefenseBonus() {
        return defenseBonus;
    }

}
