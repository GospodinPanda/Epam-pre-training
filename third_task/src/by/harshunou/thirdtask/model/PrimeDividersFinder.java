package by.harshunou.thirdtask.model;

public class PrimeDividersFinder {
        public static String findPrimeDividers(int number){
            String resultString = "";
            for (int i = 1; i <= number/2; i++){
                if((number % i == 0)&&(PrimeChecker.checkPrime(i))){
                    resultString += i+" ";
                }
            }
            return resultString;
        }
}
