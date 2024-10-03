public class Personnage {
    public static final String GUERRIER = "guerrier";
    public static final String MAGICIEN = "magicien";
    private String name;
    private String type;
    private int healthPoints;
    private int strengthPoints;

    public Personnage(){
        this.name = "Odeline Fion";
        this.type = GUERRIER;
    }

    public Personnage(String name){
        this.name = name;
        this.type = GUERRIER;
    }

    public Personnage(String type, String name){
        this.name = name;
        this.type = type;
        if (type.equals(GUERRIER)){
            healthPoints = 10;
            strengthPoints = 10;
        } else if (type.equals(MAGICIEN)){
            healthPoints = 6;
            strengthPoints = 15;
        }

    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
