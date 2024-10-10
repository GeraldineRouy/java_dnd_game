package dnd_game;

import dnd_game.plateau.Board;
import dnd_game.plateau.Case;
import dnd_game.personnage.Personnage;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Menu menu = new Menu();
        Board board = new Board();
        ArrayList<Case> fourCasesBoard = board.initialise4CasesBoard();
        Personnage player = game.characterCreation(menu);
        game.startIteration4Game(menu, player, fourCasesBoard);

    }
}