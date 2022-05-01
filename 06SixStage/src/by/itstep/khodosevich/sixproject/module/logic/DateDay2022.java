package by.itstep.khodosevich.sixproject.module.logic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateDay2022 {

    public static final int year = 2022;

    public static String getTimeFromNumber(int month, int date) {

        Calendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(2022, month, date);


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("'\nMonth: 'MM" +
                "'\nDay of week: 'EEEEE" +
                "'\nDay of year: 'D"+
                "'\nYear: 'yyyy.");
        simpleDateFormat.format(gregorianCalendar.getTime());

        String result = simpleDateFormat.format(gregorianCalendar.getTime());

        return result;
    }
}
