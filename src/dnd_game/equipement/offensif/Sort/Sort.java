package dnd_game.equipement.offensif.Sort;

import dnd_game.personnage.Magicien;
import dnd_game.personnage.Personnage;
import dnd_game.equipement.offensif.EquipementOffensif;
import dnd_game.plateau.Case;

public class Sort extends EquipementOffensif implements Case {

    public static final String SORT = "sort";

    public Sort() {
        type = SORT;
    }

    @Override
    public String toString() {
        return SORT;
    }

    @Override
    public void interaction(Personnage player) {
        if (player instanceof Magicien) {
            System.out.println(player.getName() + " s'équipe avec " + toString());
        } else {
            System.out.println(player.getName() + " est un " + player.getType() + ", il ne peut pas s'équiper de " + toString());
        }
    }
}
