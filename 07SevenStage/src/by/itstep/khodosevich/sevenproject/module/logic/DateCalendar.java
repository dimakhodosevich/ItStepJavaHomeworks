package by.itstep.khodosevich.sevenproject.module.logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateCalendar {
    public static String getNextDay(String dateString) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = simpleDateFormat.parse(dateString);
        Calendar calendar = new GregorianCalendar((date.getYear()+1900), date.getMonth(), date.getDate());

        calendar.add(Calendar.DAY_OF_MONTH, 1);

        dateString = simpleDateFormat.format(calendar.getTime());

        return dateString;
    }
}
