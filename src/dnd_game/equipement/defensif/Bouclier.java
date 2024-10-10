package dnd_game.equipement.defensif;

import dnd_game.personnage.Guerrier;
import dnd_game.personnage.Personnage;

public class Bouclier extends EquipementDefensif {


    public Bouclier() {
        this.name = "bouclier";
    }

    @Override
    public boolean interaction(Personnage player) {
        return player instanceof Guerrier;
    }
}
