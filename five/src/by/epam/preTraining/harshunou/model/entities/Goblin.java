package by.epam.preTraining.harshunou.model.entities;

import java.util.Objects;

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
        explodes = false;
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

        return Objects.hash(super.hashCode(), explodes);
    }

    @Override
    public String toString() {
        return "Goblin{" +
                " name: " + super.getName() +
                " Loyalty to tribe: " + super.getLoyaltyToTribe() +
                " explodes= "  + explodes +
                '}';
    }
}
