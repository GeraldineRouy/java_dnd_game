package dnd_game.equipement.defensif;

import dnd_game.personnage.Magicien;
import dnd_game.personnage.Personnage;

public class Philtre extends EquipementDefensif {

    public static final String PHILTRE = "Philtre";

    public Philtre(){
        name = PHILTRE;
    }

    @Override
    public boolean interaction(Personnage player) {
        return player instanceof Magicien;
    }
}
