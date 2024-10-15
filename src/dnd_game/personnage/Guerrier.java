package dnd_game.personnage;

import dnd_game.equipement.offensif.armes.Arme;
import dnd_game.equipement.defensif.Bouclier;

/**
 * The {@code Guerrier} class represents a playable warrior character in the game.
 * This class extends the {@code Personnage} class and provides specific
 * attributes and behaviors for warrior-type characters, including
 * default health points, strength, and equipment.
 */
public class Guerrier extends Personnage {
    public static final String GUERRIER = "guerrier";

    /**
     * Creates a new instance of {@code Guerrier} with the specified name.
     * Initializes the warrior's type to "warrior", sets default health points,
     * strength, and assigns offensive and defensive equipment.
     *
     * @param name the name of the warrior character.
     */
    public Guerrier(String name){
        super(name);
        type = GUERRIER;
        setHP(5); // Sets default health points for a warrior
        setStrength(5); // Sets default strength points for a warrior
        offensiveEquipment = new Arme(); // Assigns offensive equipment
        defensiveEquipment = new Bouclier(); // Assigns defensive equipment
    }

}
