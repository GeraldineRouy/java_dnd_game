public class EquipementOffensif {

    private String offensiveEquipementType;

    public EquipementOffensif(String characterType) {
        if (characterType.equals(Personnage.GUERRIER)) {
            offensiveEquipementType = "une arme";
        } else if (characterType.equals(Personnage.MAGICIEN)) {
            offensiveEquipementType = "un sort";
        } else if (characterType.equals(Personnage.LIMACE)){
            offensiveEquipementType = "un caillou";
        }
    }

    public String getWeaponType() {
        return this.offensiveEquipementType;
    }


}
