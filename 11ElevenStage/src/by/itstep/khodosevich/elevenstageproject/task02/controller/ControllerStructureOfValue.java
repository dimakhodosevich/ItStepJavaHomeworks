package by.itstep.khodosevich.elevenstageproject.task02.controller;

import by.itstep.khodosevich.elevenstageproject.view.Printer;

import static by.itstep.khodosevich.elevenstageproject.task02.module.logic.StructureOfValue.*;

import java.util.Scanner;


public class ControllerStructureOfValue {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Printer.print("Input your value: ");
        int value = SCANNER.nextInt();
        String msg = String.format("Your value %d has:\n%s",
                value, getCounterDifferentNumber(value));
        Printer.print(msg);
    }
}
