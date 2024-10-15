package dnd_game.personnage;

import dnd_game.equipement.offensif.dechets.Caillou;
import dnd_game.equipement.defensif.SlipSale;

/**
 * The {@code Pangolin} class represents a playable pangolin character in the game.
 * This is the default type of character assigned to the player if he/she doesn't choose
 * between warrior type or wizard type.
 * Playing this type can be considered as extreme difficulty mode to play the game.
 * This class extends the {@code Personnage} class and provides specific
 * attributes and behaviors for pangolin-type characters, including
 * default low health points, low strength, and poor equipment.
 */
public class Pangolin extends Personnage {

    public static final String PANGOLIN = "pangolin";

    public Pangolin(String name){
        super(name);
        type = PANGOLIN;
        setHP(1);
        setStrength(1);
        this.offensiveEquipment = new Caillou();
        this.defensiveEquipment = new SlipSale();
    }



    public String getType() {
        return PANGOLIN;
    }
}
