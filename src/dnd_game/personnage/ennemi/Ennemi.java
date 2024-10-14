package dnd_game.personnage.ennemi;

import dnd_game.personnage.Personnage;
import dnd_game.plateau.Case;

public abstract class Ennemi extends Personnage implements Case {

    public static final String ENNEMI = "ennemi";


    public String toString() {
        String message = "Il y a un " + ENNEMI + ", c'est le " + name + " !" +
                "Il a "+ healthPoints + " points de vie et son attaque est de " + strengthPoints;
        return message;
    }

    public void attack(Personnage player) {
        player.takeDamage(strengthPoints);
    }

    @Override
    public void interaction(Personnage player) {
        attack(player);
        System.out.println("Attention ! le " + name + " porte un coup à " + player.getName() + " !");
        player.attackEnemy(this);
        System.out.println(player.getName() + " contre attaque !!!");
        if (this.verifyIfIsDead()) {
            System.out.println("Victoire ! Le " + name + " est vaincu !" );
        }
    }
}
