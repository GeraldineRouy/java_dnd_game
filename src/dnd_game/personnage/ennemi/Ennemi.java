package dnd_game.personnage.ennemi;

import dnd_game.Menu;
import dnd_game.personnage.Personnage;
import dnd_game.plateau.Case;

public abstract class Ennemi extends Personnage implements Case {

    public static final String ENNEMI = "ennemi";


    public String toString() {
        String message = "Il y a un " + ENNEMI + ", c'est le " + name + " !" +
                "\nIl a "+ healthPoints + " points de vie et son attaque est de " + strengthPoints;
        return message;
    }

    public void attackPlayer(Personnage player) {
        if (strengthPoints > player.getDefenseBonus()) {
            player.setHP(player.getHP()-strengthPoints);
        }
    }

    @Override
    public void interaction(Personnage player) {
        attackPlayer(player);

    }
}
