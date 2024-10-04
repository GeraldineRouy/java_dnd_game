public class EquipementDefensif {
    private String defensiveEquipementType;

    public EquipementDefensif(String characterType) {
        if (characterType.equals(Personnage.GUERRIER)) {
            defensiveEquipementType = "un bouclier";
        } else if (characterType.equals(Personnage.MAGICIEN)) {
            defensiveEquipementType = "un philtre";
        } else {
            defensiveEquipementType = "un slip sale";
        }
    }

    public String getDefenseType() {
        return this.defensiveEquipementType;
    }
}
