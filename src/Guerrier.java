public class Guerrier extends Personnage{

    public Guerrier(String name){
        super(GUERRIER, name);
        setHP(10);
        setStrength(10);
        super.offensiveEquipment = new Arme();
        super.defensiveEquipment = new Bouclier();
        super.typeNumber = 1;
    }

    @Override
    public String getType() {
        return GUERRIER;
    }



}
