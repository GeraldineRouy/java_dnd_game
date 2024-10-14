package dnd_game.plateau;

import dnd_game.personnage.Personnage;

public class GrandePotion extends Potion implements Case {

    public static final String GRANDEPOTION = "grande potion";

    public GrandePotion() {
        name = GRANDEPOTION;
        healthBonus = 5;
    }

    @Override
    public String toString() {
        return GRANDEPOTION;
    }

}
