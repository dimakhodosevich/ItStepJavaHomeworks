package by.itstep.khodosevich.elevenstageproject.task07.controller;

import by.itstep.khodosevich.elevenstageproject.view.Printer;

import static by.itstep.khodosevich.elevenstageproject.task07.module.logic.AllPrimeNumber.*;

import java.util.Scanner;

public class ControllerAllPrimeNumber {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Printer.print("Input your number and get all prime number(s) which can divide your " +
                "value without a trace: ");
        int number = SCANNER.nextInt();
        String msg = String.format("Prime number which can divide your value %d without a trace is(are) %s",
                number, getAllPrimeNumber(number));
        Printer.print(msg);
    }
}
