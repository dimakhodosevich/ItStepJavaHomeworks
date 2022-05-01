package by.itstep.khodosevich.fifthproject.controller;

import by.itstep.khodosevich.fifthproject.module.logic.ReverseNumber;
import by.itstep.khodosevich.fifthproject.view.Printer;
import java.util.Scanner;

public class ControllerReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input your number: ");
        long var1 = scanner.nextLong();

        long var2 = ReverseNumber.reverseNumber(var1);

        String msg = String.format("Your number: %d "
                + "\nReverse number: %d", var1, var2);

        Printer.printToConsole(msg);
        scanner.close();
    }

}
