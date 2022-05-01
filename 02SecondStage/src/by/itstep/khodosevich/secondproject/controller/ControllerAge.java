package by.itstep.khodosevich.secondproject.controller;

import by.itstep.khodosevich.secondproject.module.data.Age;
import by.itstep.khodosevich.secondproject.view.Printer;

import java.util.Scanner;

public class ControllerAge {

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input age which you want translate: ");

        int year = scanner.nextInt();
        int month = Age.translateYearInMonth(year);
        int day = Age.translateYearInDay(year);
        int hour = Age.translateDayInHour(day);
        int minute = Age.translateHourInMinut(hour);
        int second = Age.translateMinutInSecond(minute);
        long millisecond = Age.translateSecondInMillisecond(second);

        String msg = String.format("%-20d %-20d %-20d %-20d %-20d %-20d %-20d"
                ,year, month, day, hour, minute, second, millisecond);

        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "Year:", "Month:"
                , "Day:", "Hour:", "Minute:", "Second:", "Millisecond:");
        Printer.printToConsole(msg);

        scanner.close();
    }
}
