package dnd_game.equipement.offensif.dechets;

import dnd_game.equipement.offensif.EquipementOffensif;
import dnd_game.personnage.Personnage;

/**
 * The {@code Caillou} class represents a small rock that serves as a piece of offensive equipment in the game.
 * It extends the {@code Dechet} class and provides a minimal strength bonus.
 */
public class Caillou extends Dechet {

    public static final String CAILLOU = "caillou";

    public Caillou() {
        name = CAILLOU;
        strengthBonus = 1;
    }

    /**
     * Returns a string representation of the small rock, including its name and strength bonus.
     *
     * @return a string describing the stone and its strength bonus.
     */
    public String toString(){
        return "Un petit " + CAILLOU + " qui vous accorde un piètre bonus de " + strengthBonus + " de force supplémentaire.";
    }


}
