package dnd_game.equipement.offensif.dechets;

import dnd_game.equipement.offensif.EquipementOffensif;
import dnd_game.personnage.Guerrier;
import dnd_game.personnage.Pangolin;
import dnd_game.personnage.Personnage;
import dnd_game.plateau.Case;

public class Dechet extends EquipementOffensif implements Case {

    public static final String DECHET = "déchet";

    public Dechet() {
        type = DECHET;
    }

    @Override
    public String toString() {
        return DECHET;
    }

    @Override
    public void interaction(Personnage player) {
        if (player instanceof Pangolin) {
            increaseStrength(player);
            System.out.println(player.getName() + " s'équipe avec " + name
                    + "\nSa force augmente de " + strengthBonus + " points !");
        } else {
            System.out.println(player.getName() + " est un " + player.getType() + ", il ne peut pas s'équiper de " + toString());
        }
    }
}
