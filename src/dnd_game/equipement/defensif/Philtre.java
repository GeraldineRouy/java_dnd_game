package dnd_game.equipement.defensif;

import dnd_game.personnage.Magicien;
import dnd_game.personnage.Personnage;

public class Philtre extends EquipementDefensif {

    public static final String PHILTRE = "Philtre";

    public Philtre(){
        name = PHILTRE;
        defenseBonus = 3;
    }

    @Override
    public void interaction(Personnage player) {
    }
}
