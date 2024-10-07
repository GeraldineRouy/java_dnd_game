public class Magicien extends Personnage{


    public Magicien(String name) {
        super(MAGICIEN, name);
        setHP(6);
        setStrength(15);
        this.offensiveEquipment = new Sort();
        this.defensiveEquipment = new Philtre();
        this.typeNumber = 2;
    }

    public String getType() {
        return MAGICIEN;
    }


}
