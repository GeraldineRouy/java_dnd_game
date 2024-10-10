package dnd_game.ennemi;

import dnd_game.plateau.Case;

public class Ennemi implements Case {

    public static final String ENNEMI = "ennemi";
    protected String name;
    protected int healthPoints;
    protected int strengthPoints;




    public String toString() {
        String message = "Il y a un " + ENNEMI + ", c'est le " + name + " !" +
                "Il a "+ healthPoints + " points de vie et son attaque est de " + strengthPoints + ".";
        return message;
    }
}
