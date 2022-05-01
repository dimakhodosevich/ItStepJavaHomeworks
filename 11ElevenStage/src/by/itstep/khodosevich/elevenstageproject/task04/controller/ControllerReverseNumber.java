package by.itstep.khodosevich.elevenstageproject.task04.controller;

import by.itstep.khodosevich.elevenstageproject.view.Printer;

import static by.itstep.khodosevich.elevenstageproject.view.Printer.*;
import static by.itstep.khodosevich.elevenstageproject.task04.module.logic.ReverseNumber.*;

import java.util.Scanner;

public class ControllerReverseNumber {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Printer.print("Input your number for reverse: ");
        int number = SCANNER.nextInt();
        String msg = String.format("Your reverse value is: %d.",
                getReverseNumber(number));
        Printer.print(msg);
    }

}
