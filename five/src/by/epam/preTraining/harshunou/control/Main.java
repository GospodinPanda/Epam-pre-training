package by.epam.preTraining.harshunou.control;

import by.epam.preTraining.harshunou.container.CustomArray;
import by.epam.preTraining.harshunou.exceptions.WrongInputException;
import by.epam.preTraining.harshunou.model.entities.Horde;
import by.epam.preTraining.harshunou.utils.OrcArmyGenerator;
import by.epam.preTraining.harshunou.view.Printer;

public class Main {

    public static void main(String[] args) {
        try {
            Horde horde = new Horde(OrcArmyGenerator.generateTribeName(), OrcArmyGenerator.generateHorde(new CustomArray<>()));
            Printer.print(horde);
            Printer.print(horde.calculateAvgLoyaltyOfHorde());
            Printer.print(horde.findWeakestCreature());
            horde.getOrcs().remove(3);
            Printer.print(horde);
            Printer.print(horde.calculateExplosiveGoblinsCount());
        } catch (WrongInputException e) {
            e.printStackTrace();
        }
    }
}
