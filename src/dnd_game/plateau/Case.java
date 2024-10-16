package dnd_game.plateau;

import dnd_game.Menu;
import dnd_game.personnage.Personnage;

/**
 * The <code>Case</code> interface defines the contract for all the cases on the game board.
 * Each case can interact with a character when the character moves onto or interacts with it.
 */
public interface Case {

    /**
     * Defines the interaction between a character and the case.
     * This method is called when the character interacts with the case.
     *
     * @param player the character interacting with the case.
     */
    void interaction (Personnage player);

}
