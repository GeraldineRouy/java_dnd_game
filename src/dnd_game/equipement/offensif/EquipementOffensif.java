package dnd_game.equipement.offensif;

import dnd_game.equipement.Equipement;
import dnd_game.personnage.Personnage;

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
        return "une " + type + ", attaque +" + strengthBonus;
    }

    public void increaseStrength(Personnage player) {
        player.setStrength(player.getStrength() + strengthBonus);
    }

}
