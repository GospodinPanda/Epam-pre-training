package by.epam.preTraining.harshunou.model.entities;

import java.util.Objects;

public class Orc extends DemonBloodCreature {
    private String fightClass;
    private int rageLevel;

    public Orc(String name) {
        super(name);
        fightClass = "undefined";
        rageLevel = 0;

    }

    public Orc(String name, int strength, int dexterity, int constitution, int intel, int loyaltyToTribe, String fightClass, int rageLevel) {

        super(name, strength, dexterity, constitution, intel, loyaltyToTribe);
        this.fightClass = fightClass;
        this.rageLevel = rageLevel;
    }

    public Orc(String name, String fightClass, int rageLevel) {
        super(name);
        this.fightClass = fightClass;
        this.rageLevel = rageLevel;
    }

    public String getFightClass() {
        return fightClass;
    }

    public void setFightClass(String fightClass) {
        this.fightClass = fightClass;
    }

    public int getRageLevel() {
        return rageLevel;
    }

    public void setRageLevel(int rageLevel) {
        this.rageLevel = rageLevel;
    }

    @Override
    public String toString() {
        return "Orc{" +
                super.toString() +
                " fightClass='" + fightClass + '\'' +
                ", rageLevel=" + rageLevel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Orc orc = (Orc) o;
        return rageLevel == orc.rageLevel &&
                Objects.equals(fightClass, orc.fightClass);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = super.hashCode();
        result = prime * result + rageLevel;
        result = prime * result + fightClass.hashCode();
        return result;

    }
}
