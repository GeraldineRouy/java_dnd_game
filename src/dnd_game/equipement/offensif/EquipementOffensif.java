package dnd_game.equipement.offensif;

import dnd_game.equipement.Equipement;

public abstract class EquipementOffensif extends Equipement {

    protected String type;
    protected int strengthBonus;


    protected EquipementOffensif(String type) {
        this.type = type;
    }

    public EquipementOffensif() {
        super();
    }

    public String toString() {
        return "une " + type + ", attaque +" + strengthBonus + " !";
    }

}
