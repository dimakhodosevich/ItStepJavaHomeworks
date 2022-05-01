package by.itstep.khodosevich.fourproject.module.logic;

public class Century {

    public static int getCentury(int year) {
        year = year < 0 ? -year : year;
        if (year == 0) {
            throw new RuntimeException();
        } else if (year <= 100) {
            year = 0;
        }
        return year % 100 >= 0 ? year / 100 + 1 : year / 100;
    }

}
