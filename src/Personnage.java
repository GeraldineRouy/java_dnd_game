public class Personnage {
    private String name;
    private String type;
    private int healthPoints;
    private int strengthPoints;

    public Personnage(){
        this.name = "Odeline Fion";
        this.type = "guerrier";
    }

    public Personnage(String name){
        this.name = name;
        this.type = "guerrier";
    }

    public Personnage(String name, String type){
        this.name = name;
        this.type = type;
        if (type.equals("guerrier")){
            healthPoints = 10;
            strengthPoints = 10;
        } else if (type.equals("magicien")){
            healthPoints = 6;
            strengthPoints = 15;
        }

    }
}
