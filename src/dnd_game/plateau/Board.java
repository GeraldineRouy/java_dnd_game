package dnd_game.plateau;

import dnd_game.ennemi.Ennemi;
import dnd_game.ennemi.Gobelin;
import dnd_game.equipement.offensif.Arme.Arme;
import dnd_game.equipement.offensif.Arme.Epee;

import java.util.ArrayList;

public class Board {

    private ArrayList<Case> board;

    public ArrayList<Case> initialise4CasesBoard() {
        ArrayList<Case> board = new ArrayList<>();

        Case case1 = new Case() {
            @Override
            public String toString() {
                return "Case vide";
            }
        };
        Ennemi goblinCase = new Gobelin();
        Arme swordCase = new Epee();
        Potion potionCase = new Potion();


        board.add(case1);
        board.add(goblinCase);
        board.add(swordCase);
        board.add(potionCase);


        return board;
    }


}
