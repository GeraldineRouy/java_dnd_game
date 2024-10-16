package dnd_game.plateau;

import dnd_game.Menu;
import dnd_game.personnage.Personnage;
import dnd_game.personnage.ennemi.Dragon;
import dnd_game.personnage.ennemi.Gobelin;
import dnd_game.personnage.ennemi.Sorcier;
import dnd_game.equipement.offensif.armes.Epee;
import dnd_game.equipement.offensif.armes.Massue;
import dnd_game.equipement.offensif.sorts.BouleDeFeu;
import dnd_game.equipement.offensif.sorts.Eclair;

import java.util.ArrayList;
import java.util.List;

/**
 * The <code>Plateau</code> class represents the game board where the characters interact with various cases.
 * It initializes the board with empty cases, enemies, and offensive equipment.
 */
public class Plateau {

    private List<Case> boardList;

    /**
     * Constructs a <code>Plateau</code> object and initializes the board with cases.
     */
    public Plateau() {
        initializeBoard();
    }

    /**
     * Initializes the board by populating it with empty cases, enemies, and equipment.
     * This method sets up the positions of different types of cases on the board.
     */
    private void initializeBoard() {
        boardList = new ArrayList<>();

        for (int i = 0; i < 64; i++) {
            // initialize empty cases
            boardList.add(new CaseVide());
        }

        /// Add goblins with a loop
        for (int i = 2; i <= 29 ; i += 3) {
            boardList.set(i, new Gobelin());
        }

        // Add enemies
        boardList.set(44, new Dragon());
        boardList.set(51, new Dragon());
        boardList.set(55, new Dragon());
        boardList.set(61, new Dragon());

        boardList.set(9, new Sorcier());
        boardList.set(19, new Sorcier());
        boardList.set(24, new Sorcier());
        boardList.set(31, new Sorcier());
        boardList.set(34, new Sorcier());
        boardList.set(35, new Sorcier());
        boardList.set(36, new Sorcier());
        boardList.set(39, new Sorcier());
        boardList.set(43, new Sorcier());
        boardList.set(46, new Sorcier());

        // Add equipment
        boardList.set(1, new Massue());
        boardList.set(4, new Massue());
        boardList.set(10, new Massue());
        boardList.set(21, new Massue());
        boardList.set(37, new Massue());

        boardList.set(18, new Epee());
        boardList.set(25, new Epee());
        boardList.set(41, new Epee());
        boardList.set(52, new Epee());

        boardList.set(0, new Eclair());
        boardList.set(3, new Eclair());
        boardList.set(7, new Eclair());
        boardList.set(16, new Eclair());
        boardList.set(22, new Eclair());

        boardList.set(47, new BouleDeFeu());
        boardList.set(48, new BouleDeFeu());

        boardList.set(6, new Potion());
        boardList.set(12, new Potion());
        boardList.set(30, new Potion());
        boardList.set(32, new Potion());
        boardList.set(38, new Potion());
        boardList.set(42, new Potion());

        boardList.set(27, new GrandePotion());
        boardList.set(40, new GrandePotion());

    }

    /**
     * Retrieves the case at the specified index on the board.
     *
     * @param index the index of the case to retrieve.
     * @return the <code>Case</code> at the specified index.
     * @throws PersonnageHorsPlateauException if the index is out of bounds.
     */
    public Case getCase(int index) {
        if (index >= 0 && index < boardList.size()) {
            return boardList.get(index);
        } else {
            throw new PersonnageHorsPlateauException();
        }
    }

    /**
     * Returns the number of cases on the board.
     *
     * @return the size of the board.
     */
    public int size() {
        return boardList.size();
    }

}
