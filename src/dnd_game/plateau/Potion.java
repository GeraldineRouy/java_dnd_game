package dnd_game.plateau;

import dnd_game.personnage.Personnage;

public class Potion implements CaisseSurprise{

    public static final String POTION = "potion";

    public Potion() {
        String name = POTION;
    }

    public String toString() {
        return POTION;
    }

    @Override
    public boolean interaction(Personnage player) {
        return true;
    }
}
