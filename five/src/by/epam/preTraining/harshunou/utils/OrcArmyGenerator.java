package by.epam.preTraining.harshunou.utils;

import by.epam.preTraining.harshunou.container.CustomArray;
import by.epam.preTraining.harshunou.container.CustomArrayInterface;
import by.epam.preTraining.harshunou.exceptions.WrongInputException;
import by.epam.preTraining.harshunou.model.entities.DemonBloodCreature;

import java.util.Random;

public class OrcArmyGenerator {
    private final static int MAXIMUM_ORCS=200;
    private final static String[] ORC_TRIBES = {"Black Claw","Blood moon","Bloody skull","Broken Bone","Ear Seekers"
            ,"Greenhaven","Iceshield","Karuck","Ripped Gut"};
    public static CustomArrayInterface<DemonBloodCreature> generateHorde() throws WrongInputException{
        int size=new Random().nextInt(MAXIMUM_ORCS);
        CustomArrayInterface<DemonBloodCreature> demons = new CustomArray<>();
        for(int i=0;i<size;i++){
            demons.addElement(DemonBloodCreatureGenerator.generateDemonBlooded());
        }
        return demons;
    }
    public static String generateTribeName()
    {
        return ORC_TRIBES[new Random().nextInt(ORC_TRIBES.length)];
    }

}
