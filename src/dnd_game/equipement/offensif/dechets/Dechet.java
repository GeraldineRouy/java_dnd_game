package dnd_game.equipement.offensif.dechets;

import dnd_game.equipement.offensif.EquipementOffensif;
import dnd_game.personnage.Guerrier;
import dnd_game.personnage.Magicien;
import dnd_game.personnage.Pangolin;
import dnd_game.personnage.Personnage;
import dnd_game.plateau.Case;

/**
 * The {@code Dechet} class represents a piece of waste or trash, an ineffective type of offensive equipment for pangolins.
 * It extends the {@code EquipementOffensif} class and implements the {@code Case} interface.
 * <p>
 * This equipment does not provide any useful bonuses or effects and is primarily a placeholder item with no real interaction.
 * Hey, after all, playing pangolin is the hardcore mode of the game.
 * Slaying enemies with a big sword would be too easy.
 * </p>
 */
public class Dechet extends EquipementOffensif implements Case {

    public static final String DECHET = "déchet";

    /**
     * Constructor for creating a new waste item.
     * Sets the type of this equipment to "déchet".
     */
    public Dechet() {
        type = DECHET;
    }

    @Override
    public String toString() {
        return DECHET;
    }

    /**
     * Defines the interaction between the player and the piece of trash.
     * If the player is an instance of {@code Pangolin}, they receive an insignificant strength bonus.
     *
     * @param player the player who interacts with the piece of waste.
     */
    @Override
    public void interaction(Personnage player) {
        if (player instanceof Pangolin) {
            player.setTotalStrength(strengthBonus);
        }
    }
}
