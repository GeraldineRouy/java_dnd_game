package dnd_game.equipement.defensif;

import dnd_game.personnage.Pangolin;
import dnd_game.personnage.Personnage;

public class SlipSale extends EquipementDefensif {

    public static final String SLIPSALE = "slip sale";

    public SlipSale() {
        name = SLIPSALE;
        defenseBonus = 1;
    }

    @Override
    public void interaction(Personnage player) {
    }
}
