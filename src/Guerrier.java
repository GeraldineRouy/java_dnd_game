public class Guerrier extends Personnage{

    public Guerrier(String name){
        super(GUERRIER, name);
        setHP(10);
        setStrength(10);
        this.offensiveEquipment = new Arme();
        this.defensiveEquipment = new Bouclier();
        this.typeNumber = 1;
    }

    public String getType() {
        return GUERRIER;
    }

}
