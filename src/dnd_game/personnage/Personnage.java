package dnd_game.personnage;

import dnd_game.Menu;
import dnd_game.equipement.defensif.EquipementDefensif;
import dnd_game.equipement.offensif.EquipementOffensif;
import dnd_game.personnage.ennemi.Ennemi;

public abstract class Personnage {

    protected String name;
    protected String type;
    protected int healthPoints;
    protected int strengthPoints;
    protected int totalStrength;
    protected EquipementOffensif offensiveEquipment;
    protected EquipementDefensif defensiveEquipment;

    protected Personnage(){
    }

    protected Personnage(String name){
        this.name = name;
    }

    protected Personnage(String type, String name){
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
        return healthPoints;
    }

    public void setHP(int hp) {
        healthPoints = hp;
    }

    public int getStrength() {
        return this.strengthPoints;
    }

    public void setStrength(int strength) {
        strengthPoints = strength;
    }

    public String getType() {
        return this.type;
    }

    public boolean isDead(){
        return this.healthPoints < 1;
    }

    public void attackEnemy (Ennemi enemy) {
        enemy.healthPoints = enemy.healthPoints - strengthPoints;
    }

    public String toString() {
        return "Nom : "+ name +
                "\nType : " + type +
                "\nVie : " + healthPoints +
                "\nForce : " +strengthPoints +
                "\nDefense : " + defensiveEquipment.getDefenseBonus();
    }

    public String getDefensiveEquipmentName() {
        return defensiveEquipment.getName();
    }

    public int getDefenseBonus() {
        return defensiveEquipment.getDefenseBonus();
    }

    public void setTotalStrength(int strengthBonus) {
        totalStrength = strengthPoints + strengthBonus;
    }

    public int getTotalStrength() {
        return totalStrength;
    }
}
