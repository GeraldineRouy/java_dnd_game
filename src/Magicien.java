public class Magicien extends Personnage{

    private String className = "Magicien";

    public Magicien(String name) {
        super(name);
        setHP(6);
        setStrength(15);
        Sort sort = new Sort();
        Philtre philtre = new Philtre();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

}
