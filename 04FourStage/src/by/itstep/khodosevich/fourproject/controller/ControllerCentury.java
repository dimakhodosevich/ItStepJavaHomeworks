package by.itstep.khodosevich.fourproject.controller;

import by.itstep.khodosevich.fourproject.module.logic.Century;
import by.itstep.khodosevich.fourproject.view.Printer;

import java.util.Scanner;

public class ControllerCentury {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.printf("Input year (Gregorian calender doesn't has 0 year!!!): ");
      int year = scanner.nextInt();

      String msg = year<0?
              String.format("year %d is %d century B.C.", year, Century.getCentury(year)):
              String.format("year %d is %d century A.C.", year, Century.getCentury(year));

        Printer.printToConsole(msg);
        scanner.close();
    }
}
