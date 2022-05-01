package by.itstep.khodosevich.elevenstageproject.task04.module.logic;

import static by.itstep.khodosevich.elevenstageproject.view.Printer.*;

public class ReverseNumber {
    private ReverseNumber() {
    }

    public static int getReverseNumber(double number) {
        int numberInt = (int) number;

        if (numberInt <= 0) {
            System.err.println(ERROR_MESSAGE);
            throw new RuntimeException();
        }

        int reverseNumber = 0;

        while (numberInt > 0) {
            int lastNumber = numberInt % 10;
            numberInt /= 10;
            reverseNumber = reverseNumber * 10 + lastNumber;
        }

        return reverseNumber;
    }
}
