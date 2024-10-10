package dnd_game.equipement;

public abstract class Equipement {

    protected String name;

    protected Equipement(String name){
        this.name = name;
    }

    protected Equipement(){}


    public String toString() {
        return name;
    }
}
