package by.itstep.khodosevich.sixproject.controller;

import by.itstep.khodosevich.sixproject.view.Printer;
import java.util.Scanner;
import static by.itstep.khodosevich.sixproject.module.logic.Data.*;

public class ControllerDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your data (example: 25-09-2022):");
        System.out.print("\nInput day: ");
        int day = scanner.nextInt();
        System.out.print("Input month: ");
        int month = scanner.nextInt();
        System.out.print("Input year: ");
        int year = scanner.nextInt();

        String msg = checkDate(day, month, year);

        Printer.printToConsole(msg);
    }
}
