package by.epam.preTraining.harshunou.model.entities;

import java.util.Objects;

public class DemonBloodCreature {
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
        this.strength = 0;
        this.dexterity = 0;
        this.constitution = 0;
        this.intel = 0;
        this.loyaltyToTribe = 100;

    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public void setLoyaltyToTribe(int loyaltyToTribe) {
        this.loyaltyToTribe = loyaltyToTribe;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getintel() {
        return intel;
    }

    public int getLoyaltyToTribe() {
        return loyaltyToTribe;
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
        result = prime * result + ((name==null?0:name.hashCode()));
        return result;
    }


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", strength=" + strength +
                ", dexterity=" + dexterity +
                ", constitution=" + constitution +
                ", intel=" + intel +
                ", loyaltyToTribe=" + loyaltyToTribe+ " ";
    }
}
