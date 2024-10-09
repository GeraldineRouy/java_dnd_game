package DnDGame.Personnage;

import DnDGame.EquipementOffensif.Sort.Sort;
import DnDGame.EquipementDefensif.Philtre;

public class Magicien extends Personnage {
    public static final String MAGICIEN = "magicien";


    public Magicien(String name) {
        super(name);
        this.type = MAGICIEN;
        setHP(6);
        setStrength(15);
        this.offensiveEquipment = new Sort();
        this.defensiveEquipment = new Philtre();
        this.typeNumber = 2;
    }

    public String getType() {
        return MAGICIEN;
    }


}
