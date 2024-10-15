package dnd_game.personnage;

import dnd_game.equipement.defensif.EquipementDefensif;
import dnd_game.equipement.offensif.EquipementOffensif;
import dnd_game.personnage.ennemi.Ennemi;

/**
 * The {@code Personnage} class represents a character in the game,
 * which could be a player (playable) character or an enemy (non playable character).
 * This abstract class defines common attributes and behaviors for all characters,
 * such as health points, strength, and equipment.
 */

public abstract class Personnage {

    protected String name;
    protected String type;
    protected int healthPoints;
    protected int strengthPoints;

    /**
     * The total strength of the character, including bonuses from equipment.
     */
    protected int totalStrength;

    /**
     * The offensive equipment the character uses to increase its attack power.
     */
    protected EquipementOffensif offensiveEquipment;

    /**
     * The defensive equipment the character uses to reduce incoming damage.
     */
    protected EquipementDefensif defensiveEquipment;

    protected Personnage(){
    }

    protected Personnage(String name){
        this.name = name;
    }

    /**
     * Constructor that initializes the character's type and name.
     *
     * @param type the type of the character (e.g., warrior, magician).
     * @param name the name of the character.
     */
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

    /**
     * Determines if the character is dead.
     * A character is considered dead if there is no health point remaining.
     *
     * @return {@code true} if the character is dead, {@code false} otherwise.
     */
    public boolean isDead(){
        return this.healthPoints < 1;
    }

    /**
     * Attacks an enemy by reducing the enemy's health points by the character's strength.
     *
     * @param enemy the enemy character being attacked.
     */
    public void attackEnemy (Ennemi enemy) {
        enemy.setHP(enemy.getHP() - totalStrength);
    }

    /**
     * Returns a string representation of the character, including name, type, health, strength,
     * and defense bonus from defensive equipment.
     *
     * @return a string containing details about the character to be displayed in the game's menu and console.
     */
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

    public String getOffensiveEquipmentName() {
        return offensiveEquipment.getName();
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
