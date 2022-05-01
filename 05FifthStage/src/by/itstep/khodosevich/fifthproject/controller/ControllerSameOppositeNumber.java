package by.itstep.khodosevich.fifthproject.controller;

import by.itstep.khodosevich.fifthproject.module.logic.SameOppositeNumber;
import by.itstep.khodosevich.fifthproject.view.Printer;
import java.util.Scanner;

public class ControllerSameOppositeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input first number: ");
        int var1 = scanner.nextInt();
        System.out.printf("Input second number: ");
        int var2 = scanner.nextInt();
        System.out.printf("Input third number: ");
        int var3 = scanner.nextInt();

        boolean result = SameOppositeNumber.checkTheSameOppositeNumber(var1, var2, var3);

        String msg = String.format("Among your numbers: %d, %d, %d - are there the same opposite numbers?"
                +"\nAnswer: %b", var1, var2, var3, result);

        Printer.printToConsole(msg);
        scanner.close();
    }

}
