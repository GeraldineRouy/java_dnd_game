package dnd_game.equipement.offensif.armes;

import dnd_game.personnage.Personnage;

public class Epee extends Arme{

    public static final String EPEE = "épée";

    public Epee(){
        super.strengthBonus = 5;
        super.name = EPEE;
    }

    public String toString(){
        return "Une " + EPEE + " qui vous accorde un bonus de " + strengthBonus + " de force supplémentaire.";
    }

}
