package dnd_game.equipement.offensif;

import dnd_game.equipement.Equipement;
import dnd_game.personnage.Personnage;

public abstract class EquipementOffensif extends Equipement {

    protected String type;
    protected int strengthBonus;

    public EquipementOffensif() {

    }

    public String toString() {
        return "une " + type + ", attaque +" + strengthBonus;
    }

    public int getStrengthBonus() {
        return strengthBonus;
    }
}
