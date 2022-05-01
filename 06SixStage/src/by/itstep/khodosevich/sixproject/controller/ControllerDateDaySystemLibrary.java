package by.itstep.khodosevich.sixproject.controller;

import by.itstep.khodosevich.sixproject.view.Printer;

import java.text.ParseException;
import java.util.Scanner;
import static by.itstep.khodosevich.sixproject.module.logic.DateDaySystemLibrary.*;

public class ControllerDateDaySystemLibrary {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input date in format: \"dd.MM.yyyy\", where dd-number of day, " +
                "mm - number of month, yyyy - number of year (example 31.03.2022)");
        String dateString = scanner.next();

        String result = getTimeFromString(dateString);
        Printer.printToConsole(result);
    }
}
