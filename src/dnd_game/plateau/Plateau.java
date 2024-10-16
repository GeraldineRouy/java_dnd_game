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
 * La classe <code>Plateau</code> représente un plateau de jeu constitué de cases.
 * Chaque case peut contenir un personnage, un équipement ou être vide.
 * Le plateau est initialisé avec des ennemis, des équipements et des potions à des positions spécifiques.
 */
public class Plateau {

    private List<Case> boardList;

    /**
     * Constructeur de la classe <code>Plateau</code>.
     * Initialise le plateau en créant les cases et en plaçant des éléments spécifiques sur celles-ci.
     */
    public Plateau() {
        initializeBoard();
    }

    /**
     * Initialise le plateau en remplissant les cases avec des instances de
     * <code>CaseVide</code>, des ennemis, des équipements et des potions.
     */
    private void initializeBoard() {
        boardList = new ArrayList<>();

        for (int i = 0; i < 64; i++) {
            // initialisation des cases vides
            boardList.add(new CaseVide());
        }

        //Ajout des gobelins avec une boucle
        for (int i = 2; i <= 29 ; i += 3) {
            boardList.set(i, new Gobelin());
        }

        // Ajouter les ennemis
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

        // Ajouter les équipements
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
     * Récupère la case à l'index spécifié du plateau.
     *
     * @param index l'index de la case à récupérer.
     * @return la case correspondante à l'index.
     * @throws PersonnageHorsPlateauException si l'index est en dehors des limites du plateau.
     */
    public Case getCase(int index) {
        if (index >= 0 && index < boardList.size()) {
            return boardList.get(index);
        } else {
            throw new PersonnageHorsPlateauException();
        }
    }

    /**
     * Renvoie la taille du plateau (nombre total de cases).
     *
     * @return la taille du plateau.
     */
    private int size() {
        return boardList.size();
    }

}
