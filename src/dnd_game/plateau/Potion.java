package dnd_game.plateau;

import dnd_game.personnage.Personnage;

public class Potion implements Case {

    public static final String POTION = "potion";

    public Potion() {
        String name = POTION;
    }

    public String toString() {
        return POTION;
    }

    @Override
    public void interaction(Personnage player) {
        System.out.println("Super !!!" + player.getName() + " boit une " + toString());
    }
}
