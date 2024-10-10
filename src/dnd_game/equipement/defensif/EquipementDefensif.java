package dnd_game.equipement.defensif;

import dnd_game.equipement.Equipement;

public abstract class EquipementDefensif extends Equipement {

    protected String type;
    protected int defenseBonus;

    public EquipementDefensif() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return type + defenseBonus;
    }

}
