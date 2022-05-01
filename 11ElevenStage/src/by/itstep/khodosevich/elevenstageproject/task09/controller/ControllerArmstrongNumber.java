package by.itstep.khodosevich.elevenstageproject.task09.controller;

import by.itstep.khodosevich.elevenstageproject.view.Printer;

import java.util.Scanner;

import static by.itstep.khodosevich.elevenstageproject.task09.module.logic.ArmstrongNumber.*;

public class ControllerArmstrongNumber {

    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Printer.print("Input number degree for get Armstrong numbers: ");
        int number = SCANNER.nextInt();
        String msg = String.format("Armstrong number for your degree is(are): %s.",
                getArmstrongNumber(number));
        Printer.print(msg);
    }
}
