package by.itstep.khodosevich.eightproject.task05.module.logic;

public class Data {
    public static final int JANUARY = 31;
    public static int FEBRUARY = 28;
    public static final int MARCH = 31;
    public static final int APRIL = 30;
    public static final int MAY = 31;
    public static final int JUNE = 30;
    public static final int JULY = 31;
    public static final int AUGUST = 31;
    public static final int SEPTEMBER = 30;
    public static final int OCTOBER = 31;
    public static final int NOVEMBER = 30;
    public static final int DECEMBER = 31;

    public static int getDayOfMonth(int month) {

        if (month < 1 || month > 12) {
            return -1;
        }

        int result = DECEMBER;

        switch (month) {
            case 1:
                result = JANUARY;
                break;
            case 2:
                result = FEBRUARY;
                break;
            case 3:
                result = MARCH;
                break;
            case 4:
                result = APRIL;
                break;
            case 5:
                result = MAY;
                break;
            case 6:
                result = JUNE;
                break;
            case 7:
                result = JULY;
                break;
            case 8:
                result = AUGUST;
                break;
            case 9:
                result = SEPTEMBER;
                break;
            case 10:
                result = OCTOBER;
                break;
            case 11:
                result = NOVEMBER;
                break;
        }

        return result;
    }

    public static boolean isLeapYear(int year){
        boolean result = year%4==0 && year%100!=0 || year%400 ==0;

        if(result){
           FEBRUARY++;
        }

    return result;
    }


}
