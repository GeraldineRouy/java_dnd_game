public class Personnage {
    public static final String GUERRIER = "guerrier";
    public static final String MAGICIEN = "magicien";
    public static final String PANGOLIN = "pangolin";
    private String name;

    private String type;
    private int healthPoints;
    private int strengthPoints;
    private EquipementOffensif offensiveEquipment;
    private EquipementDefensif defensiveEquipment;

    public Personnage(){
        this.name = "Odeline Fion";
        this.type = PANGOLIN;
        defineSpecsByCharacterType();
    }

    public Personnage(String name){
        this.name = name;
        this.type = PANGOLIN;
        defineSpecsByCharacterType();
    }

    public Personnage(String type, String name){
        this.name = name;
        this.type = type;
        defineSpecsByCharacterType();
    }

    public void defineSpecsByCharacterType() {
        if (type.equals(GUERRIER)){
            this.healthPoints = 10;
            this.strengthPoints = 10;
            this.offensiveEquipment = new EquipementOffensif(GUERRIER);
            this.defensiveEquipment = new EquipementDefensif(GUERRIER);
        } else if (type.equals(MAGICIEN)){
            this.healthPoints = 6;
            this.strengthPoints = 15;
            this.offensiveEquipment = new EquipementOffensif(MAGICIEN);
            this.defensiveEquipment = new EquipementDefensif(MAGICIEN);
        } else {
            this.healthPoints = 1;
            this.strengthPoints = 1;
            this.offensiveEquipment = new EquipementOffensif(PANGOLIN);
            this.defensiveEquipment = new EquipementDefensif(PANGOLIN);
        }
    }

    public String getCharacterType() {
        return type;
    }

    public String getCharacterName() {
        return name;
    }

    public void setCharacterName(String characterName) {
        this.name = characterName;
    }

    public void setCharacterType(String characterType) {
        this.type = characterType;
    }

    public int getCharacterHP() {
        return this.healthPoints;
    }

    public int getCharacterStrength() {
        return this.strengthPoints;
    }

    public String getCharacterWeapon() {
        return this.offensiveEquipment.getWeaponType();
    }

    public String getCharacterDefense() {
        return this.defensiveEquipment.getDefenseType();
    }

    public String toString() {
        String message = "Votre avatar s'appelle "+ name + " et c'est un " + type + "." +
                "\nSon niveau de vie est de "+ healthPoints +" points." +
                "\nSon attaque est de "+ strengthPoints +" points." +
                "\nIl attaque avec "+ offensiveEquipment.getWeaponType() + " et se défends avec " + defensiveEquipment.getDefenseType() + ".";
        return message;
    }
}
