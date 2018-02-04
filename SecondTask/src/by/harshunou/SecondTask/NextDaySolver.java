package by.harshunou.SecondTask;

public class NextDaySolver {
    public static final int MONTHS_IN_YEAR = 12;
    public static final int DAYS_IN_SHORT_MONTHS = 30;
    public static final int DAYS_IN_LONG_MONTHS = 31;
    public static final int DAYS_IN_LONG_FEBRUARY = 29;
    public static final int DAYS_IN_SHORT_FEBRUARY = 28;
    public static final int FEBRUARY = 2;

    public static String whatIsTheNextDay(int day, int month, int year) {
        if (month == MONTHS_IN_YEAR && day == DAYS_IN_LONG_MONTHS) {
            year++;
            day = 1;
            month = 1;
        } else if (((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day == DAYS_IN_LONG_MONTHS)
                || ((month == 4 || month == 6 || month == 9 || month == 11) && day == DAYS_IN_SHORT_MONTHS)
                || (year % 4 == 0 && month == FEBRUARY && day == DAYS_IN_LONG_FEBRUARY)
                || (year % 4 != 0 && month == FEBRUARY && day == DAYS_IN_SHORT_FEBRUARY)) {
            month++;
            day = 1;
        } else {
            day++;
        }
        return "date is: " + day + "." + month + "." + year;
    }

}
