package dnd_game.equipement.offensif.Arme;

import dnd_game.personnage.Guerrier;
import dnd_game.personnage.Personnage;
import dnd_game.plateau.CaisseSurprise;
import dnd_game.equipement.offensif.EquipementOffensif;

public class Arme extends EquipementOffensif implements CaisseSurprise {

    public static final String ARME = "arme";


    public Arme() {
        type = ARME;
    }

    @Override
    public boolean interaction(Personnage player) {
        return player instanceof Guerrier;
    }
}
