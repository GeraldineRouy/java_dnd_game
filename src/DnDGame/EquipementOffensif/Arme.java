package DnDGame.EquipementOffensif;

import DnDGame.Board.Case;

public class Arme extends EquipementOffensif implements Case {

    public static final String ARME = "arme";

    public Arme() {

        this.name = ARME;
    }

    public String toString() {
        return name;
    }


}
