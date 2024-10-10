package dnd_game.personnage;

import dnd_game.equipement.offensif.Sort.Sort;
import dnd_game.equipement.defensif.Philtre;

public class Magicien extends Personnage {
    public static final String MAGICIEN = "magicien";


    public Magicien(String name) {
        super(name);
        this.type = MAGICIEN;
        setHP(6);
        setStrength(15);
        this.offensiveEquipment = new Sort();
        this.defensiveEquipment = new Philtre();
    }


}
