public class Pangolin extends Personnage{

    private String className = "pangolin";

    public Pangolin(String name){
        super(name);
        setHP(1);
        setStrength(1);
        Caillou rock = new Caillou();
        SlipSale dirtyPanty = new SlipSale();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
