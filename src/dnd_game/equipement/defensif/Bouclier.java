package dnd_game.equipement.defensif;

import dnd_game.personnage.Guerrier;
import dnd_game.personnage.Personnage;

public class Bouclier extends EquipementDefensif {

    public static final String BOUCLIER = "bouclier";

    public Bouclier() {
        name = BOUCLIER;
        defenseBonus = 2;
    }

    @Override
    public void interaction(Personnage player) {
    }
}
