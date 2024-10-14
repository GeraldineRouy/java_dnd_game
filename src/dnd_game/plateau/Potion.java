package dnd_game.plateau;

import dnd_game.personnage.Personnage;

public class Potion implements Case {

    public static final String POTION = "potion";

    protected String name;
    protected int healthBonus;

    public Potion() {
        name = POTION;
        healthBonus = 2;
    }

    public String toString() {
        return POTION;
    }

    public void increasePlayerHealth(Personnage player) {
        player.setHP(player.getHP() + healthBonus);
    }

    @Override
    public void interaction(Personnage player) {
        increasePlayerHealth(player);
        System.out.println("Super !!!" + player.getName() + " boit une " + name + " qui lui donne " + healthBonus + "points de vie !");
    }
}
