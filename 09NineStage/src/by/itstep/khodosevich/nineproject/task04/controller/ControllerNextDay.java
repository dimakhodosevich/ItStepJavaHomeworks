package by.itstep.khodosevich.nineproject.task04.controller;

import by.itstep.khodosevich.nineproject.task04.view.Printer;

import java.text.ParseException;
import java.util.Scanner;

import static by.itstep.khodosevich.nineproject.task04.module.logic.NextDay.getNextDay;

public class ControllerNextDay {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        Printer.print("Input your date if format(dd.MM.yyyy): ");
        String dateString = scanner.next();

        dateString =String.format("Next day is: %s.", getNextDay(dateString));
        Printer.print(dateString);
        scanner.close();
    }
}
