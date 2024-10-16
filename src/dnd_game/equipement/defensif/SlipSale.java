package dnd_game.equipement.defensif;

import dnd_game.personnage.Pangolin;
import dnd_game.personnage.Personnage;

/**
 * The {@code SlipSale} class represents a dirty underwear that serves as a piece of defensive equipment
 * in the game for pangolins.
 * It extends the {@code EquipementDefensif} class and provides a minimal defense bonus.
 */
public class SlipSale extends EquipementDefensif {

    public static final String SLIPSALE = "slip sale";

    /**
     * Constructs a new instance of {@code SlipSale} with a defined defense bonus.
     */
    public SlipSale() {
        name = SLIPSALE;
        defenseBonus = 1;
    }

    /**
     * Defines the interaction of the slip sale with the given player.
     * Currently, this method does not implement any specific behavior.
     *
     * @param player the player interacting with the slip sale.
     */
    @Override
    public void interaction(Personnage player) {
        // No interaction behavior implemented yet.
    }
}
