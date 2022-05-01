package by.itstep.khodosevich.elevenstageproject.task06.controller;

import by.itstep.khodosevich.elevenstageproject.view.Printer;

import java.util.Scanner;

import static by.itstep.khodosevich.elevenstageproject.task06.module.logic.Factorial.*;

public class ControllerFactorial {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Printer.print("Input your number for calculate factorial: ");
        int number = SCANNER.nextInt();
        String msg = String.format("Factorial %d equals %d.",
                number, calculateFactorial(number));
        Printer.print(msg);
    }
}
