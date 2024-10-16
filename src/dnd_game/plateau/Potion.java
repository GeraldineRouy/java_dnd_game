package dnd_game.plateau;

import dnd_game.personnage.Personnage;

/**
 * The {@code Potion} class represents a health potion in the game.
 * When a player lands on a tile containing a potion, their health is restored
 * by a certain amount. This class implements the {@code Case} interface.
 */
public class Potion implements Case {

    public static final String POTION = "potion";

    protected String name;
    protected int healthBonus;

    /**
     * Constructs a new {@code Potion} instance.
     * By default, the potion restores 2 health points.
     */
    public Potion() {
        name = POTION;
        healthBonus = 2;
    }

    public String toString() {
        return POTION;
    }

    /**
     * Increases the player's health by the potion's health bonus.
     *
     * @param player the player whose health will be restored.
     */
    public void increasePlayerHealth(Personnage player) {
        player.setHP(player.getHP() + healthBonus);
    }

    public int getHealthBonus() {
        return healthBonus;
    }

    /**
     * Executes the interaction when the player lands on this potion.
     * It restores health to the player.
     *
     * @param player the player interacting with the potion.
     */
    @Override
    public void interaction(Personnage player) {
        increasePlayerHealth(player);
    }
}
