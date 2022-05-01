package by.itstep.khodosevich.nineproject.task04.module.logic;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// перевод из String в SimpleDateFormat
// из SimpleDateFormat в Date
// добавление Date в Calendar
// добавление +1 день в Calendar
// Перевод из Calendar в миллисекунды
// Из миллисекунд в String

public class NextDay {

    public static String getNextDay (String dateString) throws ParseException {

        if(dateString == null || dateString.isEmpty()){
            throw new RuntimeException();
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        simpleDateFormat.setLenient(false);
        Date date = simpleDateFormat.parse(dateString);

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);

        calendar.add(Calendar.DATE, 1);
        date = calendar.getTime();
        dateString = simpleDateFormat.format(date);

        return dateString;
    }
}
