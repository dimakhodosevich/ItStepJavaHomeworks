package by.itstep.khodosevich.elevenstageproject.task01.controller;

import by.itstep.khodosevich.elevenstageproject.view.Printer;
import static by.itstep.khodosevich.elevenstageproject.task01.module.logic.NumberSumAndCounter.*;

import java.util.Scanner;

public class ControllerNumberSumAndCounter {
    private static final Scanner SCANNER= new Scanner(System.in);

    public static void main(String[] args) {
        Printer.print("Input your number: ");
        int number = SCANNER.nextInt();
        String msg = String.format("The sum of your value %d is %d. Your value consist %d number(s).",
                number, getSumOfValue(number), countNumberOfValue(number));
        Printer.print(msg);
    }
}
