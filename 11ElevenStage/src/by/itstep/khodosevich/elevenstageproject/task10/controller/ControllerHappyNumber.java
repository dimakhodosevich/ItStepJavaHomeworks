package by.itstep.khodosevich.elevenstageproject.task10.controller;

import by.itstep.khodosevich.elevenstageproject.view.Printer;

import java.util.Scanner;

import static by.itstep.khodosevich.elevenstageproject.task10.module.logic.HappyNumber.*;

public class ControllerHappyNumber {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Printer.print("Input number of the ticket: ");
        int number = SCANNER.nextInt();
        String msg = String.format("Do you have happy number of you ticket?\nAnswer: %b.",
                isHappyNumber(number));
        Printer.print(msg);
    }
}
