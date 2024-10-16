package dnd_game.personnage.ennemi;

import dnd_game.Menu;
import dnd_game.personnage.Personnage;
import dnd_game.plateau.Case;

/**
 * The {@code Ennemi} class represents an enemy in the game.
 * This is an abstract class that serves as a base for specific enemy types
 * such as goblins, dragons, and others.
 * <p>
 * An enemy can interact with the player by engaging in combat and dealing damage
 * based on its attack strength and the player's defense.
 * </p>
 */

public abstract class Ennemi extends Personnage implements Case {

    public static final String ENNEMI = "ennemi";


    /**
     * Provides a description of the enemy, including its name, health points, and attack strength.
     *
     * @return a string message to be displayed in the game's menu or console.
     */
    public String toString() {
        String message = "Il y a un " + ENNEMI + ", c'est le " + name + " !" +
                "\nIl a "+ healthPoints + " points de vie et son attaque est de " + strengthPoints;
        return message;
    }

    /**
     * Engages the enemy in combat with the player.
     * Player's defensive equipment includes a defense bonus,
     * the defense will absorb part or all of the enemy's attack strength.
     * If the enemy's attack strength exceeds the player's defense bonus,
     * the player will receive damage equal to the difference between the enemy's strength and the defense bonus.
     * Otherwise, the player takes no damage.
     *
     * @param player the player character who is being attacked by the enemy.
     */
    public void attackPlayer(Personnage player) {
        if (strengthPoints > player.getDefenseBonus()) {
            player.setHP(player.getHP()-strengthPoints);
        }
    }

    /**
     * Executes the interaction between the {@code Case} interface and the player.
     * This method initiates combat by calling {@link #attackPlayer(Personnage)}.
     *
     * @param player the player character interacting with the enemy case.
     */
    @Override
    public void interaction(Personnage player) {
        attackPlayer(player);
    }
}
