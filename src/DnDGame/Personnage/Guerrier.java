package DnDGame.Personnage;

import DnDGame.EquipementOffensif.Arme.Arme;
import DnDGame.EquipementDefensif.Bouclier;

public class Guerrier extends Personnage {
    public static final String GUERRIER = "guerrier";

    public Guerrier(String name){
        super(name);
        super.type = GUERRIER;
        setHP(10);
        setStrength(10);
        super.offensiveEquipment = new Arme();
        super.defensiveEquipment = new Bouclier();
        super.typeNumber = 1;
    }

    @Override
    public String getType() {
        return GUERRIER;
    }



}
