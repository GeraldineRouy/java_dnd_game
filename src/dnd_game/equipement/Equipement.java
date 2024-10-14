package dnd_game.equipement;

import dnd_game.Menu;
import dnd_game.personnage.Personnage;
import dnd_game.plateau.Case;

public abstract class Equipement implements Case {

    protected String name;


    protected Equipement(){}


    public String toString() {
        return name;
    }


}
