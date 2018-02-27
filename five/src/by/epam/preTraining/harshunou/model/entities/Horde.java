package by.epam.preTraining.harshunou.model.entities;

import by.epam.preTraining.harshunou.container.CustomArray;
import by.epam.preTraining.harshunou.container.CustomArrayInterface;
import by.epam.preTraining.harshunou.exceptions.WrongInputException;
import by.epam.preTraining.harshunou.utils.OrcArmyGenerator;

import java.util.Objects;

public class Horde {
    private String tribeName;
    private CustomArrayInterface<DemonBloodCreature> orcs;


    public Horde(String tribeName, CustomArrayInterface<DemonBloodCreature> orcs) throws WrongInputException {
        this.tribeName = tribeName;
        this.orcs = orcs;

    }

    public String getTribeName() {
        return tribeName;
    }

    public void setTribeName(String tribeName) {
        this.tribeName = tribeName;
    }

    public CustomArrayInterface<DemonBloodCreature> getOrcs() {
        return orcs;
    }

    public void setOrcs(CustomArrayInterface<DemonBloodCreature> orcs) {
        this.orcs = orcs;
    }

    public int calculateAvgLoyaltyOfHorde() throws WrongInputException {
        int sum = 0;
        for (int i = 0; i < orcs.size(); i++) {
            DemonBloodCreature currentFlesh = orcs.get(i);
            sum += currentFlesh.getLoyaltyToTribe();
        }
        return sum / orcs.size();
    }

    public DemonBloodCreature findStrongestCreature() throws WrongInputException {
        int str = -1;
        int temp = -1;
        for (int i = 0; i < orcs.size(); i++) {
            if (str < orcs.get(i).getStrength()) {
                str = orcs.get(i).getStrength();
                temp = i;
            }
        }
        return orcs.get(temp);
    }

    public DemonBloodCreature findWeakestCreature() throws WrongInputException {
        int str = 11;
        int temp = -1;
        for (int i = 0; i < orcs.size(); i++) {
            if (str > orcs.get(i).getStrength()) {
                str = orcs.get(i).getStrength();
                temp = i;
            }
        }
        return orcs.get(temp);
    }

    public int calculateExplosiveGoblinsCount() throws WrongInputException {
        int count = 0;
        for (int i = 0; i < orcs.size(); i++) {
            if (orcs.get(i) instanceof Goblin && ((Goblin) orcs.get(i)).isExplodes())
                count++;
        }
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horde horde = (Horde) o;
        return Objects.equals(tribeName, horde.tribeName) &&
                Objects.equals(orcs, horde.orcs);
    }

    @Override
    public int hashCode() {
        int result = 1;
        int prime = 31;
        result = prime * result + tribeName.hashCode();
        try {
            for (int i = 0; i < orcs.size(); i++) {
                result = prime * result + orcs.get(i).hashCode();
            }
        } catch (WrongInputException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Horde{" +
                "tribeName='" + tribeName + '\'' +
                ", orcs=" + orcs +
                '}';
    }
}
