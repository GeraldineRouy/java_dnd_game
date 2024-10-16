package dnd_game.equipement.offensif.sorts;

import dnd_game.personnage.Magicien;
import dnd_game.personnage.Personnage;
import dnd_game.equipement.offensif.EquipementOffensif;
import dnd_game.plateau.Case;

/**
 * The {@code Sort} class represents a magical spell in the game, which is a type of offensive equipment.
 * This class extends {@code EquipementOffensif} and implements the {@code Case} interface.
 * <p>
 * Spells can only be equipped by characters of the {@code Magicien} class, providing a strength bonus.
 * </p>
 */
public class Sort extends EquipementOffensif implements Case {

    public static final String SORT = "sort";

    /**
     * Constructor for creating a new spell.
     * Sets the type of offensive equipment to "sort".
     */
    public Sort() {
        type = SORT;
    }

    @Override
    public String toString() {
        return SORT;
    }

    /**
     * Defines the interaction between the player and the spell.
     * If the player is a {@code Magicien}, the spell increases the player's total strength by the spell's strength bonus.
     *
     * @param player the player character interacting with the spell.
     */
    @Override
    public void interaction(Personnage player) {
        if (player instanceof Magicien) {
            player.setTotalStrength(strengthBonus);
        }
    }
}
