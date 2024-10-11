package dnd_game.personnage;

import dnd_game.equipement.defensif.EquipementDefensif;
import dnd_game.equipement.offensif.EquipementOffensif;

public abstract class Personnage {

    protected String name;
    protected String type;
    protected int healthPoints;
    protected int strengthPoints;
    protected EquipementOffensif offensiveEquipment;
    protected EquipementDefensif defensiveEquipment;

    public Personnage(){
    }

    public Personnage(String name){
        this.name = name;
    }

    public Personnage(String type, String name){
        this.name = name;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return this.healthPoints;
    }

    public void setHP(int hp) {
        this.healthPoints = hp;
    }

    public int getStrength() {
        return this.strengthPoints;
    }

    public void setStrength(int strength) {
        this.strengthPoints = strength;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "Nom : "+ name +
                "\nType : " + type +
                "\nVie : " + healthPoints +
                "\nForce : " +strengthPoints;
    }
}
