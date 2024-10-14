package dnd_game.personnage;

import dnd_game.equipement.defensif.EquipementDefensif;
import dnd_game.equipement.offensif.EquipementOffensif;
import dnd_game.personnage.ennemi.Ennemi;

public abstract class Personnage {

    protected String name;
    protected String type;
    protected boolean isAlive;
    protected int healthPoints;
    protected double defenseRatio;
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

    public boolean verifyIfIsDead(){
        return this.healthPoints < 1;
    }

    public void takeOffensiveEquipment () {
        offensiveEquipment.increaseStrength(this);
    }

    public void takeDamage(int enemyDamage) {
        double damageReduction = (double) defensiveEquipment.getDefenseBonus() /10;
        double damage = enemyDamage*damageReduction;
        healthPoints -= (int) damage;
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
}
