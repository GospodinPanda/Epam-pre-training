package by.harshunou.SecondTask;

public class Main {

    public static void main(String[] args) {

        int dragonsAge = 500;

        System.out.println("The count of " + dragonsAge + " year old dragon heads is: " + DragonHeads.dragonHeadsCounter(dragonsAge));
        System.out.println("The count of " + dragonsAge + " year old dragon eyes is: " + DragonHeads.dragonEyesCounter(dragonsAge));
        System.out.println(VowelOrConsonant.checkTheLetter('c'));
        System.out.println(VowelOrConsonant.checkTheLetter('o'));
        System.out.println(MoodSensor.generateMood());
        System.out.println(NextDaySolver.whatIsTheNextDay(31, 12, 2002));
        System.out.println(NextDaySolver.whatIsTheNextDay(30, 11, 2007));
        System.out.println(FiguresToWords.transform(777));
    }
}
