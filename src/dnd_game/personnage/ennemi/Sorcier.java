package dnd_game.personnage.ennemi;

import dnd_game.personnage.Personnage;

public class Sorcier extends Ennemi{

    public static final String SORCIER = "sorcier";

    public Sorcier() {
        name = SORCIER;
        healthPoints = 9;
        strengthPoints = 2;
    }
}
