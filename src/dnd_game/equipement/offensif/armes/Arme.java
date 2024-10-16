package dnd_game.equipement.offensif.armes;

import dnd_game.personnage.Guerrier;
import dnd_game.personnage.Personnage;
import dnd_game.equipement.offensif.EquipementOffensif;
import dnd_game.plateau.Case;

/**
 * The {@code Arme} class represents a weapon in the game, which is a type of offensive equipment.
 * This class extends the {@code EquipementOffensif} class and implements the {@code Case} interface,
 * allowing interaction with the player when encountered on the game board.
 * <p>
 * Weapons can only be used by a {@code Guerrier}, and they provide a strength bonus to the player
 * when equipped. If the player is a warrior or does not already have this weapon equipped,
 * it increases the player's total strength.
 * </p>
 */
public class Arme extends EquipementOffensif implements Case {

    public static final String ARME = "arme";


    public Arme() {
        type = ARME;
    }

    public String toString() {
        return ARME;
    }

    /**
     * Defines the interaction between the player and the weapon when encountered on the game board.
     * <p>
     * If the player is a {@code Guerrier} or the player is not already equipped with the weapon,
     * the player's total strength is increased by the weapon's strength bonus.
     * </p>
     *
     * @param player the player interacting with the weapon.
     */
    @Override
    public void interaction(Personnage player) {
        if (player instanceof Guerrier || !isAlreadyEquippedByPlayer(player)) {
            player.setTotalStrength(strengthBonus);
        }
    }
}
