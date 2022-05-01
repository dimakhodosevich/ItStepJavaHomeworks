package by.itstep.khodosevich.elevenstageproject.task08.controller;

import by.itstep.khodosevich.elevenstageproject.view.Printer;

import java.util.Scanner;

import static by.itstep.khodosevich.elevenstageproject.task08.module.logic.GreatestCommonDivisor.*;
import static by.itstep.khodosevich.elevenstageproject.task08.module.logic.LeastCommonMultiple.*;


public class ControllerNumber {

    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static void main(String[] args) {

        Printer.print("Input two numbers to find greatest common divisor and" +
                " least common multiple numbers (numbers>1).\n");

        Printer.print("First number: ");
        int var1 = SCANNER.nextInt();
        Printer.print("Second number: ");
        int var2 = SCANNER.nextInt();

        String msg = String.format("Greatest common divisor = %d, " +
                        "\nLeast common multiple = %d.",
                getGreatestCommonDivisor(var1, var2), getLeastCommonMultiple(var1, var2));

        Printer.print(msg);

        Printer.print("\nIf greatest common divisor = -1, it means that this value doesn't exist.");
    }

}
