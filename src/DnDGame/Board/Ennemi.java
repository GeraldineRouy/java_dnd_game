package DnDGame.Board;

public class Ennemi implements Case{

    public static final String ENNEMI = "ennemi";
    private String name;

    public Ennemi() {
        name = ENNEMI;
    }


    public String toString() {
        return ENNEMI;
    }
}
