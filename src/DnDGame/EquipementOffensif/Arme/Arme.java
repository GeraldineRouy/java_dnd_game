package DnDGame.EquipementOffensif.Arme;

import DnDGame.Board.CaisseSurprise;
import DnDGame.EquipementOffensif.EquipementOffensif;

public class Arme extends EquipementOffensif implements CaisseSurprise {

    public static final String ARME = "arme";
    protected int strengthBonus;
    protected String type;
    protected String name;

    public Arme() {

        type = ARME;
    }

    public String toString() {
        return "C'est une " + ARME + " !";
    }


}
