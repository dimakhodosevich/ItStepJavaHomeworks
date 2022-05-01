package by.itstep.khodosevich.sevenproject.controller;

import by.itstep.khodosevich.sevenproject.view.Printer;

import java.text.ParseException;
import java.util.Scanner;
import static by.itstep.khodosevich.sevenproject.module.logic.DateCalendar.*;

public class ControllerDateCalendar {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your date:");
        String dateString = scanner.next();

        Printer.printToConsole(getNextDay(dateString));

        scanner.close();
    }
}
