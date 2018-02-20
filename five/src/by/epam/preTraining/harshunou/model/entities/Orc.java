package by.epam.preTraining.harshunou.model.entities;

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
                "name: " + super.getName() +
                " Loyalty to tribe: " + super.getLoyaltyToTribe() +
                " fightClass='" + fightClass + '\'' +
                ", rageLevel=" + rageLevel +
                '}';
    }
}
