package by.epam.preTraining.harshunou.utils;

import by.epam.preTraining.harshunou.exceptions.WrongInputException;
import by.epam.preTraining.harshunou.model.entities.DemonBloodCreature;
import by.epam.preTraining.harshunou.model.entities.Goblin;
import by.epam.preTraining.harshunou.model.entities.Orc;
import by.epam.preTraining.harshunou.model.entities.Troll;

import java.util.Random;

public class DemonBloodCreatureGenerator {
    private static  DemonBloodCreatureGenerator generator;
    private final static int MAXIMUM_STAT = 10;
    private final static String[] ORC_NAMES = {"Bugrash",
            "Vukgilug", "Wubdagog", " Unrugagh", "Sarod", "Zalthu", "Vrograg", "Xurl", "Olumba", "Kubub", "Corgak",
            "Nag", "Ysagubar", "Kukgilug", "Nulgha", "Wrukaog", "Zuhgan", "Yatur", "Shagrol", "Jukkhag", "Nargol",
            "Lazgar", "Rulfim", "Snak", "Glasha", "Bum", "Nargol", "Rolfish", "Sharamph", " Bulfim"};

    private final static String[] ORC_FIGHTER_CLASS = {"Warrior", "Berserk", "Shaman", "Hunter", "The Mountain", "Flesh Shield"};
    private final static int MAXIMUM_LOYALTY = 100;
    private final static int MAXIMUM_CRIT = 100;
    private final static int MAXIMUM_RAGE = 5;

    private DemonBloodCreatureGenerator() {
    }

    public static  DemonBloodCreatureGenerator getInstance(){
        if(generator==null){
            generator= new DemonBloodCreatureGenerator();
        }
        return generator;
    }
    public  DemonBloodCreature generateDemonBlooded() throws WrongInputException {
        Random random = new Random();
        DemonBloodCreature demonBloodCreature;
        switch (random.nextInt(3)) {
            case 0:
                demonBloodCreature = new Orc(ORC_NAMES[random.nextInt(ORC_NAMES.length)],
                        random.nextInt(MAXIMUM_STAT), random.nextInt(MAXIMUM_STAT), random.nextInt(MAXIMUM_STAT),
                        random.nextInt(MAXIMUM_STAT), random.nextInt(MAXIMUM_LOYALTY),
                        ORC_FIGHTER_CLASS[random.nextInt(ORC_FIGHTER_CLASS.length)], random.nextInt(MAXIMUM_RAGE));
                break;
            case 1:
                demonBloodCreature = new Troll(ORC_NAMES[random.nextInt(ORC_NAMES.length)],
                        random.nextInt(MAXIMUM_STAT), random.nextInt(MAXIMUM_STAT), random.nextInt(MAXIMUM_STAT),
                        random.nextInt(MAXIMUM_STAT), random.nextInt(MAXIMUM_LOYALTY),
                        random.nextInt(MAXIMUM_CRIT), random.nextBoolean());
                break;
            case 2:
                demonBloodCreature = new Goblin(ORC_NAMES[random.nextInt(ORC_NAMES.length)],
                        random.nextInt(MAXIMUM_STAT), random.nextInt(MAXIMUM_STAT), random.nextInt(MAXIMUM_STAT),
                        random.nextInt(MAXIMUM_STAT), random.nextInt(MAXIMUM_LOYALTY),
                        random.nextBoolean());
                break;
            default:
                demonBloodCreature = new Orc(ORC_NAMES[random.nextInt(ORC_NAMES.length)],
                        random.nextInt(MAXIMUM_STAT), random.nextInt(MAXIMUM_STAT), random.nextInt(MAXIMUM_STAT),
                        random.nextInt(MAXIMUM_STAT), random.nextInt(MAXIMUM_LOYALTY),
                        ORC_FIGHTER_CLASS[random.nextInt(ORC_FIGHTER_CLASS.length)], random.nextInt(MAXIMUM_RAGE));
        }
        return demonBloodCreature;
    }
}
