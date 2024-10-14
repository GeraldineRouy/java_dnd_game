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

public class Plateau {

    private List<Case> boardList;

    public Plateau() {
        initializeBoard();
    }

    public void initialise4CasesBoard() {

        boardList = new ArrayList<>();

        boardList.add(new CaseVide());
        boardList.add(new Gobelin());
        boardList.add(new Epee());
        boardList.add(new Potion());

    }

    public void initializeBoard() {
        boardList = new ArrayList<>();

        for (int i = 0; i < 64; i++) {
            boardList.add(new CaseVide()); // initialisation des cases vides
        }

        //Ajout des gobelins avec une boucle
        for (int i = 3; i <= 30 ; i += 3) {
            boardList.set(i, new Gobelin());
        }

        // Ajouter les ennemis
        boardList.set(45, new Dragon());
        boardList.set(52, new Dragon());
        boardList.set(56, new Dragon());
        boardList.set(62, new Dragon());

        boardList.set(10, new Sorcier());
        boardList.set(20, new Sorcier());
        boardList.set(25, new Sorcier());
        boardList.set(32, new Sorcier());
        boardList.set(35, new Sorcier());
        boardList.set(36, new Sorcier());
        boardList.set(37, new Sorcier());
        boardList.set(40, new Sorcier());
        boardList.set(44, new Sorcier());
        boardList.set(47, new Sorcier());

        // Ajouter les équipements
        boardList.set(2, new Massue());
        boardList.set(5, new Massue());
        boardList.set(11, new Massue());
        boardList.set(22, new Massue());
        boardList.set(38, new Massue());

        boardList.set(19, new Epee());
        boardList.set(26, new Epee());
        boardList.set(42, new Epee());
        boardList.set(53, new Epee());

        boardList.set(1, new Eclair());
        boardList.set(4, new Eclair());
        boardList.set(8, new Eclair());
        boardList.set(17, new Eclair());
        boardList.set(23, new Eclair());

        boardList.set(48, new BouleDeFeu());
        boardList.set(49, new BouleDeFeu());

        boardList.set(7, new Potion());
        boardList.set(13, new Potion());
        boardList.set(31, new Potion());
        boardList.set(33, new Potion());
        boardList.set(39, new Potion());
        boardList.set(43, new Potion());

        boardList.set(28, new GrandePotion());
        boardList.set(41, new GrandePotion());

    }

    public Case getCase(int index) {
        if (index >= 0 && index < boardList.size()) {
            return boardList.get(index);
        } else {
            throw new PersonnageHorsPlateauException();
        }
    }



    public int size() {
        return boardList.size();
    }

}
