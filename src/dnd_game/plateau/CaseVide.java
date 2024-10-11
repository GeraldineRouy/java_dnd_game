package dnd_game.plateau;

import dnd_game.personnage.Personnage;

public class CaseVide implements Case{

    public static final String CASEVIDE = "case vide";

    public CaseVide() {
        String name = CASEVIDE;

    }



    public String toString(){
        return CASEVIDE;
    }


    @Override
    public void interaction(Personnage player) {
        System.out.println(toString() + ", RAS.");
    }
}
