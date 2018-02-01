package by.harshunou.SecondTask;

public class NextDaySolver {
    public static String whatIsTheNextDay(int day,int month,int year)
    {
        if(month==12&&day==31){
            year++;
            day=1;
            month=1;
        }
        else if(((month==1||month==3||month==5||month==7||month==8||month==10||month==12) && day==31)
        ||((month==4||month==6||month==9||month==11) && day==30)
            ||(year%4==0&&month==2&&day==29)
            ||(year%4!=0&&month==2&&day==28))
        {
            month++;
            day =1;
        }
        else
        {
            day++;
        }
        return "date is; "+day+"."+month+"."+year;
    }

}
