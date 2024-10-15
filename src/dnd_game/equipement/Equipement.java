package dnd_game.equipement;

import dnd_game.Menu;
import dnd_game.personnage.Personnage;
import dnd_game.plateau.Case;

/**
 * The {@code Equipement} class represents a piece of equipment in the game.
 * This class serves as an abstract base class for various types of equipment
 * that can be used by characters. It implements the {@code Case} interface,
 * allowing equipment to interact with the player, enabling specific types
 * (such as {@code Guerrier} or {@code Magicien}) to equip this item
 * based on their compatibility.
 */
public abstract class Equipement implements Case {

    protected String name;

    protected Equipement(){}

    /**
     * Returns the string representation of the equipment, which is its name.
     *
     * @return the name of the equipment as a {@code String} to be displayed in the game's menu and console.
     */
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public boolean isAlreadyEquippedByPlayer(Personnage player) {
        return this.name.equals(player.getName());
    }
}
