package dnd_game.equipement.offensif.sorts;

/**
 * The {@code BouleDeFeu} class represents a fireball spell, which is a powerful type of offensive equipment for magicians.
 * This class extends the {@code Sort} class and defines specific attributes for the fireball spell.
 * <p>
 * The fireball spell provides a significant strength bonus of 7 to magicians who equip it.
 * </p>
 */
public class BouleDeFeu extends Sort{

    public static final String BOULEDEFEU = "boule de feu";

    /**
    * Constructor for creating a new fireball spell.
    * Sets the spell's name to "boule de feu" and provides a strength bonus of 7.
    */
    public BouleDeFeu(){
        name = BOULEDEFEU;
        strengthBonus = 7;
    }
}
