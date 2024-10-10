package dnd_game.plateau;

import dnd_game.Menu;
import dnd_game.ennemi.Ennemi;
import dnd_game.ennemi.Gobelin;
import dnd_game.equipement.offensif.Arme.Arme;
import dnd_game.equipement.offensif.Arme.Epee;
import dnd_game.personnage.Personnage;

import java.util.ArrayList;

public class Board {

    public Board () {
       ArrayList<Case> boardList = initialise4CasesBoard();
    }

    public ArrayList<Case> initialise4CasesBoard() {
        ArrayList<Case> board = new ArrayList<>();

        Case case1 = new Case() {
            @Override
            public boolean interaction(Personnage player) {
                return false;
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

    public void takeItem(int index, ArrayList<Case> board, Personnage player, Menu menu) {
        if (board.get(index).interaction(player)) {
            menu.displayInteraction(player.getName(), board.get(index).toString());
        }
    }


}
