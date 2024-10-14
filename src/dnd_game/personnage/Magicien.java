package dnd_game.personnage;

import dnd_game.equipement.offensif.sorts.Sort;
import dnd_game.equipement.defensif.Philtre;

public class Magicien extends Personnage {
    public static final String MAGICIEN = "magicien";


    public Magicien(String name) {
        super(name);
        type = MAGICIEN;
        setHP(3);
        setStrength(8);
        offensiveEquipment = new Sort();
        defensiveEquipment = new Philtre();
    }


}
