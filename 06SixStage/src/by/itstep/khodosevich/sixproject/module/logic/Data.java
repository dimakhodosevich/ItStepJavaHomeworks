package by.itstep.khodosevich.sixproject.module.logic;

public class Data {

    public static final int START_YEAR = 6;

    public static final int JANUARY = 31;
    public static final int FEBRUARY = 28;
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

    public static final int FIRST_DECADE = JANUARY + FEBRUARY + MARCH;
    public static final int SECOND_DECADE = APRIL + MAY + JUNE;
    public static final int THIRD_DECADE = JULY + AUGUST + SEPTEMBER;
    public static final int FOUR_DECADE = OCTOBER + NOVEMBER + DECEMBER;


    public static String checkDate(int day, int mount, int year) {

        int allDay = 0;
        String monthName = "DECEMBER";

        switch (mount) {
            case 1:
                allDay = day;
                monthName = "JANUARY";
                break;
            case 2:
                allDay += JANUARY + day;
                monthName = "FEBRUARY";
                break;
            case 3:
                allDay += JANUARY + FEBRUARY + day;
                monthName = "MARCH";
                break;
            case 4:
                allDay += JANUARY + FEBRUARY + MARCH + day;
                monthName = "APRIL";
                break;
            case 5:
                allDay += JANUARY + FEBRUARY + MARCH + APRIL + day;
                monthName = "MAY";
                break;
            case 6:
                allDay += JANUARY + FEBRUARY + MARCH + APRIL + MAY + day;
                monthName = "JUNE";
                break;
            case 7:
                allDay += JANUARY + FEBRUARY + MARCH + APRIL + MAY + JUNE + day;
                monthName = "JULY";
                break;
            case 8:
                allDay += JANUARY + FEBRUARY + MARCH + APRIL + MAY + JUNE + JULY + day;
                monthName = "AUGUST";
                break;
            case 9:
                allDay += JANUARY + FEBRUARY + MARCH + APRIL + MAY + JUNE + JULY + AUGUST + day;
                monthName = "SEPTEMBER";
                break;
            case 10:
                allDay += JANUARY + FEBRUARY + MARCH + APRIL + MAY + JUNE + JULY + AUGUST + SEPTEMBER + day;
                monthName = "OCTOBER";
                break;
            case 11:
                allDay += JANUARY + FEBRUARY + MARCH + APRIL + MAY + JUNE + JULY + AUGUST + SEPTEMBER + OCTOBER + day;
                monthName = "NOVEMBER";
                break;
            case 12:
                allDay += JANUARY + FEBRUARY + MARCH + APRIL + MAY + JUNE + JULY + AUGUST + SEPTEMBER + OCTOBER
                        + NOVEMBER + day;
                break;
        }

        int dayNumber = (allDay + START_YEAR - 2) % 7;
        String dayName = "SATURDAY";

        switch (dayNumber) {
            case 0:
                dayName = "MONDAY";
                break;
            case 1:
                dayName = "TUESDAY";
                break;
            case 2:
                dayName = "WEDNESDAY";
                break;
            case 3:
                dayName = "THURSDAY";
                break;
            case 4:
                dayName = "FRIDAY";
                break;
            case 5:
                dayName = "SUNDAY";
                break;
        }

        StringBuilder stringBuilder = new StringBuilder();

        String result = stringBuilder.append("DAY NUMBER = ").append(allDay).
                append("; DAY NAME = ").append(dayName).
                append("; MONTH NUMBER = ").append(mount).
                append("; MONTH NAME = ").append(monthName).
                append("; YEAR = ").append(year) + ".";

        return result;
    }
}
