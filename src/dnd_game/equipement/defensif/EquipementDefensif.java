package dnd_game.equipement.defensif;

import dnd_game.equipement.Equipement;
import dnd_game.personnage.Personnage;

public abstract class EquipementDefensif extends Equipement {

    public static final String EQUIPEMENTDEFENSIF = "équipement défensif";

    protected String type;
    protected int defenseBonus;

    public EquipementDefensif() {
        type = EQUIPEMENTDEFENSIF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "un " + name + ", vie +" + defenseBonus;
    }

    public int getDefenseBonus() {
        return defenseBonus;
    }

//    public double getDefenseRatio() {
//        return (double) defenseBonus/10;
//    }

}
