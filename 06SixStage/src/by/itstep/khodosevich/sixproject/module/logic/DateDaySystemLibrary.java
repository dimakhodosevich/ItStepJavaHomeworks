package by.itstep.khodosevich.sixproject.module.logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDaySystemLibrary {

    public static final int MILLISECOND_IN_SECOND= 1000;
    public static final int SECOND_IN_MINUTE = 60;
    public static final int MINUTE_IN_HOUR = 60;

    public static String getTimeFromString(String dateString) throws ParseException {

        long millisecondNow = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date dateStart = simpleDateFormat.parse(dateString);

        long millisecond = millisecondNow -dateStart.getTime();
        int second = (int)(millisecond/ MILLISECOND_IN_SECOND);
        int minute = second/SECOND_IN_MINUTE;
        int hour = minute/MINUTE_IN_HOUR;

        String result = String.format("From your day passed: \nMillisecond = %d; " +
                "\nSecond = %d; \nMinute = %d; \nHour = %d.", millisecond, second, minute, hour);

        return result;
    }
}
