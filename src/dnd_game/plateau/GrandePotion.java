package dnd_game.plateau;

import dnd_game.personnage.Personnage;

public class GrandePotion implements CaisseSurprise{
    @Override
    public boolean interaction(Personnage player) {
        return true;
    }
}
