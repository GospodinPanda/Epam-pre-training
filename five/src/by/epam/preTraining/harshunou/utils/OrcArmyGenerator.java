package by.epam.preTraining.harshunou.utils;

import by.epam.preTraining.harshunou.container.CustomArray;
import by.epam.preTraining.harshunou.container.CustomArrayInterface;
import by.epam.preTraining.harshunou.exceptions.WrongInputException;
import by.epam.preTraining.harshunou.model.entities.DemonBloodCreature;

import java.util.Random;

public class OrcArmyGenerator {
    private static OrcArmyGenerator orcGenerator;

    private final static int MAXIMUM_ORCS = 200;
    private final static String[] ORC_TRIBES = {"Black Claw", "Blood moon", "Bloody skull", "Broken Bone", "Ear Seekers"
            , "Greenhaven", "Iceshield", "Karuck", "Ripped Gut"};

    private OrcArmyGenerator(){
    }
    public static OrcArmyGenerator getInstance() {
        if(orcGenerator==null){
            orcGenerator= new OrcArmyGenerator();
        }
        return orcGenerator;
    }
    public CustomArrayInterface<DemonBloodCreature> generateHorde(CustomArrayInterface<DemonBloodCreature> demons) throws WrongInputException {
        int size = new Random().nextInt(MAXIMUM_ORCS);
        for (int i = 0; i < size; i++) {
            demons.addElement(DemonBloodCreatureGenerator.getInstance().generateDemonBlooded());
        }
        return demons;
    }

    public String generateTribeName() {
        return ORC_TRIBES[new Random().nextInt(ORC_TRIBES.length)];
    }

}
