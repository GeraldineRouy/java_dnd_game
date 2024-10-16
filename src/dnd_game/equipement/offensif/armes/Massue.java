package dnd_game.equipement.offensif.armes;


/**
 * The {@code Massue} class represents a club in the game, which is a type of weapon.
 * This class extends the {@code Arme} class and provides a specific strength bonus to the player when equipped.
 * <p>
 * Clubs provide a strength bonus of 3 to the player, increasing their total strength.
 * </p>
 * */
public class Massue extends Arme{

    public static final String MASSUE = "massue";

    /**
     * Constructor for creating a new club.
     * Sets the strength bonus to 3 and the name to "massue".
     */
    public Massue() {
        super.strengthBonus= 3;
        super.name = MASSUE;
    }

    /**
     * Returns a string representation of the club, including its name and strength bonus.
     *
     * @return a string describing the club and its strength bonus.
     */
    public String toString() {
        return "Une " + MASSUE + " qui vous accorde un bonus de " + strengthBonus + " de force supplémentaire.";
    }
}
