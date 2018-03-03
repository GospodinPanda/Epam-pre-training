package by.epam.preTraining.harshunou.model.entities;

import java.util.Objects;

public class DemonBloodCreature {
    private static final int DEFAULT_STRENGTH = 0;
    private static final int DEFAULT_DEXTERITY = 0;
    private static final int DEFAULT_CONSTITUTION = 0;
    private static final int DEFAULT_INTEL = 0;
    private static final int DEFAULT_LOYALTY = 100;
    private String name;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intel;
    private int loyaltyToTribe;

    public DemonBloodCreature(String name, int strength, int dexterity, int constitution, int intel, int loyaltyToTribe) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intel = intel;
        this.loyaltyToTribe = loyaltyToTribe;
    }

    public DemonBloodCreature(String name) {
        this.name = name;
        this.strength = DEFAULT_STRENGTH;
        this.dexterity = DEFAULT_DEXTERITY;
        this.constitution = DEFAULT_CONSTITUTION;
        this.intel = DEFAULT_INTEL;
        this.loyaltyToTribe = DEFAULT_LOYALTY;

    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getintel() {
        return intel;
    }

    public int getLoyaltyToTribe() {
        return loyaltyToTribe;
    }

    public void setLoyaltyToTribe(int loyaltyToTribe) {
        this.loyaltyToTribe = loyaltyToTribe;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemonBloodCreature that = (DemonBloodCreature) o;
        return strength == that.strength &&
                dexterity == that.dexterity &&
                constitution == that.constitution &&
                intel == that.intel &&
                loyaltyToTribe == that.loyaltyToTribe &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + strength;
        result = prime * result + dexterity;
        result = prime * result + constitution;
        result = prime * result + intel;
        result = prime * result + loyaltyToTribe;
        result = prime * result + ((name == null ? 0 : name.hashCode()));
        return result;
    }


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", strength=" + strength +
                ", dexterity=" + dexterity +
                ", constitution=" + constitution +
                ", intel=" + intel +
                ", loyaltyToTribe=" + loyaltyToTribe + " ";
    }
}
