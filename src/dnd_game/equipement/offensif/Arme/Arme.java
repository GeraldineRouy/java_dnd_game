package dnd_game.equipement.offensif.Arme;

import dnd_game.plateau.CaisseSurprise;
import dnd_game.equipement.offensif.EquipementOffensif;

public class Arme extends EquipementOffensif implements CaisseSurprise {

    public static final String ARME = "arme";


    public Arme() {
        type = ARME;
    }

}
