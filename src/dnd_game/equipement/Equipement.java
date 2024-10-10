package dnd_game.equipement;

import dnd_game.personnage.Guerrier;
import dnd_game.personnage.Personnage;
import dnd_game.plateau.CaisseSurprise;

public abstract class Equipement implements CaisseSurprise {

    protected String name;

    protected Equipement(String name){
        this.name = name;
    }

    protected Equipement(){}


    public String toString() {
        return name;
    }

}
