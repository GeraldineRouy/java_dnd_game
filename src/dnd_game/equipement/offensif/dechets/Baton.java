package dnd_game.equipement.offensif.dechets;

/**
 * The {@code Baton} class represents a stick that serves as a piece of offensive equipment in the game.
 * It extends the {@code Dechet} class and provides a modest strength bonus.
 */
public class Baton extends Dechet{

    public static final String BATON = "baton";

    public Baton() {
        name = BATON;
        strengthBonus = 2;
    }

    /**
     * Returns a string representation of the baton, including its name and strength bonus.
     *
     * @return a string describing the baton and its strength bonus.
     */
    public String toString(){
        return "Un " + BATON + " qui vous accorde un bonus de " + strengthBonus + " de force supplémentaire.";
    }
}
