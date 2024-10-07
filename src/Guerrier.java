public class Guerrier extends Personnage{

    private String className = "Guerrier";

    public Guerrier(String characterName){
        super(characterName);
        setHP(10);
        setStrength(10);
        Arme weapon = new Arme();
        Bouclier shield = new Bouclier();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
