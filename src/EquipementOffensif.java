public class EquipementOffensif {

    private String offensiveEquipementType;

    public EquipementOffensif(String characterType) {
        if (characterType.equals(Personnage.GUERRIER)) {
            offensiveEquipementType = "une arme";
        } else if (characterType.equals(Personnage.MAGICIEN)) {
            offensiveEquipementType = "un sort";
        } else if (characterType.equals(Personnage.PANGOLIN)){
            offensiveEquipementType = "un caillou";
        }
    }

    public String getWeaponType() {
        return this.offensiveEquipementType;
    }


}
