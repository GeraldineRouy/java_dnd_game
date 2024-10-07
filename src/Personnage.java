public abstract class Personnage {
    public static final String GUERRIER = "guerrier";
    public static final String MAGICIEN = "magicien";
    public static final String PANGOLIN = "pangolin";
    protected String name;

    protected int typeNumber;
    protected String type;
    protected int healthPoints;
    protected int strengthPoints;
    protected EquipementOffensif offensiveEquipment;
    protected EquipementDefensif defensiveEquipment;

    public Personnage(){
    }

    public Personnage(String name){
        this.name = name;
    }

    public Personnage(String type, String name){
        this.name = name;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeByNumberType() {
        if (typeNumber == 1) {
            type = GUERRIER;
        } else if (typeNumber == 2) {
            type = MAGICIEN;
        } else {
            type = PANGOLIN;
        }
        return type;
    }

    public void setType(int characterType) {
        if (typeNumber == 1) {
            type = GUERRIER;
        } else if (typeNumber == 2) {
            type = MAGICIEN;
        } else {
            type = PANGOLIN;
        }
    }

    public int getHP() {
        return this.healthPoints;
    }

    public void setHP(int hp) {
        this.healthPoints = hp;
    }

    public int getStrength() {
        return this.strengthPoints;
    }

    public void setStrength(int strength) {
        this.strengthPoints = strength;
    }

    public String getOffensiveEquipment() {
        return this.offensiveEquipment.getWeaponType();
    }

    public String getDefense() {
        return this.defensiveEquipment.getDefenseType();
    }

    public String toString() {
        String message = "Votre avatar s'appelle "+ name + ".";
        if (this.typeNumber == 1) {
            message = message + "\n Vous incarnez un fier " + GUERRIER + " !!!";
        } else if (this.typeNumber == 2) {
            message = message + "\n Vous incarnez un puissant " + MAGICIEN + " !!!";
        } else {
            message = message + "\n Vous incarnez un ... " + PANGOLIN + " ...";
        }
        return message;
    }
}
