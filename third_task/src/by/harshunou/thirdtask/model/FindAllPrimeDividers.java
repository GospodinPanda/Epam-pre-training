package by.harshunou.thirdtask.model;

public class FindAllPrimeDividers {
        public static String findPrimeDividers(int number){
            String resultString = "";
            for (int i = 1; i <= number; i++){
                if((number % i == 0)&&(CheckForPrime.isPrime(i))){
                    resultString += i+" ";
                }
            }
            return resultString;
        }
}
