package dnd_game.plateau;

import dnd_game.personnage.Personnage;

/**
 * The {@code CaseVide} class represents an empty tile on the game board.
 * This class implements the {@code Case} interface but does not cause
 * any particular effect when a player lands on it.
 */
public class CaseVide implements Case{

    public static final String CASEVIDE = "case vide";

    /**
            * Constructs a new {@code CaseVide} instance.
     */
    public CaseVide() {
        String name = CASEVIDE;
    }

    public String toString(){
        return CASEVIDE;
    }

    /**
     * Performs no action when a player lands on this tile.
     *
     * @param player the player landing on the empty tile.
     */
    @Override
    public void interaction(Personnage player) {
        // No interaction with the player for an empty tile
    }
}
