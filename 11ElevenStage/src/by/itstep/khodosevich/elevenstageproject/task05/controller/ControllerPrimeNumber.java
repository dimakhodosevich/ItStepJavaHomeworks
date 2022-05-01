package by.itstep.khodosevich.elevenstageproject.task05.controller;

import by.itstep.khodosevich.elevenstageproject.view.Printer;

import java.util.Scanner;

import static by.itstep.khodosevich.elevenstageproject.task05.module.logic.PrimeNumber.*;

public class ControllerPrimeNumber {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Printer.print("Input your number for check is prime or not: ");
        int number = SCANNER.nextInt();
        String msg = String.format("Your number is prime? %b.",
                isPrimeNumber(number));
        Printer.print(msg);
    }
}
