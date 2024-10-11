package dnd_game.plateau;

public class PersonnageHorsPlateauException extends IndexOutOfBoundsException {

    public PersonnageHorsPlateauException() {
        super("Vous avez fini de traverser le plateau de jeu.");
    }
}
