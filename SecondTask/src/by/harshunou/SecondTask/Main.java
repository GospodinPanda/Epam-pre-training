package by.harshunou.SecondTask;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.setProperty("console.encoding","utf-8");
        int n = Inputter.inputInt("Введите число");
        System.out.println("The count of " + n + " year old dragon heads is: " + DragonHeads.DragonHeadsCounter(n));
        System.out.println("The count of " + n + " year old dragon eyes is: " + DragonHeads.DragonEyesCounter(n));
        System.out.println(VowelOrConsonant.checkTheLetter(Inputter.inputChar("Введите букву").charAt(0)));
        System.out.println( MoodSensor.generateMood());
        System.out.println(NextDaySolver.whatIsTheNextDay(31,12,2002));
        System.out.println(FiguresToWords.transform(777));
    }
}
