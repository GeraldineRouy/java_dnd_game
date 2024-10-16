package dnd_game.equipement.offensif.armes;

import dnd_game.personnage.Personnage;

/**
 * The {@code Epee} class represents a sword in the game, which is a type of weapon.
 * This class extends the {@code Arme} class and provides a specific strength bonus to the player when equipped.
 * <p>
 * Swords provide a strength bonus of 5 to the player, increasing their total strength.
 * </p>
 */
public class Epee extends Arme{

    public static final String EPEE = "épée";

    /**
     * Constructor for creating a new sword.
     * Sets the strength bonus to 5 and the name to "épée".
     */
    public Epee(){
        super.strengthBonus = 5;
        super.name = EPEE;
    }

    /**
     * Returns a string representation of the sword, including its name and strength bonus.
     *
     * @return a string describing the sword and its strength bonus.
     */
    public String toString(){
        return "Une " + EPEE + " qui vous accorde un bonus de " + strengthBonus + " de force supplémentaire.";
    }

}
