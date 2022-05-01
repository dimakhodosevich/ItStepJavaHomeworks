package by.itstep.khodosevich.sixproject.controller;

import by.itstep.khodosevich.sixproject.view.Printer;

import java.util.Scanner;

import static by.itstep.khodosevich.sixproject.module.logic.DateDay2022.*;

public class ControllerDateDay2022 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input day and month of 2022 year");
        System.out.print("Input day: ");
        int day = scanner.nextInt();
        System.out.print("Input month: ");
        int month = scanner.nextInt();

        String result = getTimeFromNumber(month-1, day-1);

        Printer.printToConsole(result);
    }
}
