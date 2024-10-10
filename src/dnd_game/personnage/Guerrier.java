package dnd_game.personnage;

import dnd_game.equipement.offensif.Arme.Arme;
import dnd_game.equipement.defensif.Bouclier;

public class Guerrier extends Personnage {
    public static final String GUERRIER = "guerrier";

    public Guerrier(String name){
        super(name);
        super.type = GUERRIER;
        setHP(10);
        setStrength(10);
        super.offensiveEquipment = new Arme();
        super.defensiveEquipment = new Bouclier();
    }




}
