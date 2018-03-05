package by.epam.preTraining.harshunou.model.entities;

public class Goblin extends DemonBloodCreature {
    private boolean explodes;

    public Goblin(String name, int strength, int dexterity, int constitution, int intelect, int loyalityToTribe, boolean explodes) {
        super(name, strength, dexterity, constitution, intelect, loyalityToTribe);
        this.explodes = explodes;
    }

    public Goblin(String name, boolean explodes) {
        super(name);
        this.explodes = explodes;
    }

    public Goblin(String name) {
        super(name);
    }

    public boolean isExplodes() {
        return explodes;
    }

    public void setExplodes(boolean explodes) {
        this.explodes = explodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Goblin goblin = (Goblin) o;
        return explodes == goblin.explodes;
    }

    @Override
    public int hashCode() {

        int prime = 31;
        int result = super.hashCode();
        result = prime * result + (explodes ? 1231 : 1237);
        return result;
    }

    @Override
    public String toString() {
        return "Goblin{" +
                super.toString() +
                " explodes= " + explodes +
                '}';
    }
}
