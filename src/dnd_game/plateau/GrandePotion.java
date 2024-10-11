package dnd_game.plateau;

import dnd_game.personnage.Personnage;

public class GrandePotion implements Case {

    public static final String GRANDEPOTION = "grande potion";

    @Override
    public String toString() {
        return GRANDEPOTION;
    }

    @Override
    public void interaction(Personnage player) {
        System.out.println("Super !!!" + player.getName() + " boit une " + toString());
    }
}
