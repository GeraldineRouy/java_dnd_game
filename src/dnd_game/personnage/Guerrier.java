package dnd_game.personnage;

import dnd_game.equipement.offensif.armes.Arme;
import dnd_game.equipement.defensif.Bouclier;

public class Guerrier extends Personnage {
    public static final String GUERRIER = "guerrier";

    public Guerrier(String name){
        super(name);
        type = GUERRIER;
        setHP(5);
        setStrength(5);
        offensiveEquipment = new Arme();
        defensiveEquipment = new Bouclier();
    }




}
