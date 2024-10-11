package dnd_game.equipement.offensif.Arme;

import dnd_game.personnage.Guerrier;
import dnd_game.personnage.Personnage;
import dnd_game.equipement.offensif.EquipementOffensif;
import dnd_game.plateau.Case;

public class Arme extends EquipementOffensif implements Case {

    public static final String ARME = "arme";


    public Arme() {
        type = ARME;
    }

    public String toString() {
        return ARME;
    }

    @Override
    public void interaction(Personnage player) {
        if (player instanceof Guerrier) {
            System.out.println(player.getName() + " s'équipe avec " + toString() );
        } else {
            System.out.println(player.getName() + " est un " + player.getType() + ", il ne peut pas s'équiper de " + toString());
        }
    }
}
