package by.itstep.khodosevich.eightproject.task05.controller;

import by.itstep.khodosevich.eightproject.task01.view.Printer;
import static by.itstep.khodosevich.eightproject.task05.module.logic.Data.*;
import java.util.Scanner;

public class ControllerData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input number of month (JANUARY = 1, FEBRUARY = 2 ... DECEMBER = 12):");
        int month = scanner.nextInt();
        Printer.print("Input year:");
        int year = scanner.nextInt();

        isLeapYear(year);
        String msg = String.format("In you year %d, at your month %d, days = %d.",
                year, month, getDayOfMonth(month));
        Printer.print(msg);

        scanner.close();
    }
}
