package by.harshunou.thirdtask.model;

public class NOKFinder {
    public static int findNOK(int first,int second)
    {
        return first*second/ NODFinder.findNOD(first,second);
    }
}
