package DnDGame.EquipementOffensif.Arme;

public class Massue extends Arme{

    public static final String MASSUE = "massue";

    public Massue() {
        name = MASSUE;
        strengthBonus = 3;
    }

    public String toString() {
        return "Une " + MASSUE + " qui vous accorde un bonus de " + strengthBonus + " de force supplémentaire.";
    }
}
