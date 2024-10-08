package DnDGame.Personnage;

import DnDGame.EquipementOffensif.Sort;
import DnDGame.EquipementDefensif.Philtre;

public class Magicien extends Personnage {


    public Magicien(String name) {
        super(Personnage.MAGICIEN, name);
        setHP(6);
        setStrength(15);
        this.offensiveEquipment = new Sort();
        this.defensiveEquipment = new Philtre();
        this.typeNumber = 2;
    }

    public String getType() {
        return Personnage.MAGICIEN;
    }


}
