package DnDGame;

import DnDGame.Board.Case;
import DnDGame.Personnage.Personnage;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Menu menu = new Menu();
        ArrayList<Case> board = game.initializeSimplifiedBoard();
        Personnage player = game.characterCreation(menu);
        game.startIteration4Game(menu, player, board);

    }
}