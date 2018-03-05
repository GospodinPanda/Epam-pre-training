package by.harshunou.firsttask.first;

public class SumAndComp {
    public static int summ(int a) {
        int sum = 0;
        sum += a % 10;
        sum += (a /= 10) % 10;
        sum += (a /= 10) % 10;
        sum += (a /= 10) % 10;
        sum += (a /= 10) % 10;
        return sum;
    }

    public static int composition(int a) {
        int composit = 1;
        composit *= a % 10;
        composit *= (a /= 10) % 10;
        composit *= (a /= 10) % 10;
        composit *= (a /= 10) % 10;
        composit *= (a /= 10) % 10;
        return composit;
    }
}
