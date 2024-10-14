package dnd_game.equipement.offensif.armes;

public class Massue extends Arme{

    public static final String MASSUE = "massue";

    public Massue() {
        super.strengthBonus= 3;
        super.name = MASSUE;
    }

    public String toString() {
        return "Une " + MASSUE + " qui vous accorde un bonus de " + strengthBonus + " de force supplémentaire.";
    }
}
