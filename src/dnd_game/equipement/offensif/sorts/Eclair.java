package dnd_game.equipement.offensif.sorts;

/**
 * The {@code Eclair} class represents a lightning spell, which is a type of offensive equipment for magicians.
 * This class extends the {@code Sort} class and defines specific attributes for the lightning spell.
 * <p>
 * The lightning spell provides a strength bonus of 2 to magicians who equip it.
 * </p>
 */
public class Eclair extends Sort{

    public static final String ECLAIR = "éclair";

    /**
     * Constructor for creating a new lightning spell.
     * Sets the spell's name to "éclair" and provides a strength bonus of 2.
     */
    public Eclair(){
        name = ECLAIR;
        strengthBonus = 2;
    }
}
