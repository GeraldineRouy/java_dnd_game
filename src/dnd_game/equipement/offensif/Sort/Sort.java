package dnd_game.equipement.offensif.Sort;

import dnd_game.plateau.CaisseSurprise;
import dnd_game.equipement.offensif.EquipementOffensif;

public class Sort extends EquipementOffensif implements CaisseSurprise {

    public static final String SORT = "sort";

    public Sort() {
        type = SORT;
    }
}
