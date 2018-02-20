package by.epam.preTraining.harshunou.model.entities;

import java.util.Objects;

public class Troll extends DemonBloodCreature {
    private int criticalChance;
    private boolean cannibal;

    public Troll(String name) {
        super(name);
        criticalChance = 0;
        cannibal = false;
    }

    public Troll(String name, int strength, int dexterity, int constitution, int intelect, int loyalityToTribe, int criticalChance, boolean cannibal) {

        super(name, strength, dexterity, constitution, intelect, loyalityToTribe);
        this.criticalChance = criticalChance;
        this.cannibal = cannibal;
    }

    public Troll(String name, int criticalChance, boolean cannibal) {
        super(name);
        this.criticalChance = criticalChance;
        this.cannibal = cannibal;
    }

    public int getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(int criticalChance) {
        this.criticalChance = criticalChance;
    }

    public boolean isCannibal() {
        return cannibal;
    }

    public void setCannibal(boolean cannibal) {
        this.cannibal = cannibal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Troll troll = (Troll) o;
        return criticalChance == troll.criticalChance &&
                cannibal == troll.cannibal;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), criticalChance, cannibal);
    }

    @Override
    public String toString() {
        return "Troll{" +
                "name:" + super.getName() +
                "loyalty to tribe: " + super.getLoyaltyToTribe() +
                "criticalChance=" + criticalChance +
                ", cannibal=" + cannibal +
                '}';
    }
}