package by.itstep.khodosevich.secondproject.module.data;

public class Age {
    public static final int MONTHS_IN_YEAR = 12;
    public static final int DAYS_IN_YEAR = 365;
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTS_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUT = 60;
    public static final int MILLISECONDS_IN_SECOND =1000;

    public static int translateYearInMonth (int year){
    if(year<=0){
        throw new RuntimeException();
    }
        return year*MONTHS_IN_YEAR;
    }

    public static int translateYearInDay(int month){
        if(month<=0){
            throw new RuntimeException();
        }
        return month*DAYS_IN_YEAR;
    }

    public static int translateDayInHour(int day){
        if(day<=0){
            throw new RuntimeException();
        }
        return day*HOURS_IN_DAY;
    }

    public static int translateHourInMinut(int hour){
        if(hour<=0){
            throw new RuntimeException();
        }
        return hour*MINUTS_IN_HOUR;
    }

    public static int translateMinutInSecond(int minut){
        if(minut<=0){
            throw new RuntimeException();
        }
        return minut*SECONDS_IN_MINUT;
    }

    public static long translateSecondInMillisecond(long second){
        if(second<=0){
            throw new RuntimeException();
        }
        return (long)(second*MILLISECONDS_IN_SECOND);
    }


}
