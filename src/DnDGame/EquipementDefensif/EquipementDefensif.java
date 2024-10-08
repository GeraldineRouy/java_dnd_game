package DnDGame.EquipementDefensif;

public abstract class EquipementDefensif {

    protected String name;

    public EquipementDefensif() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString () {
        return this.name;
    }

}
