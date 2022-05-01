package by.itstep.khodosevich.fifthproject.controller;

import by.itstep.khodosevich.fifthproject.module.logic.AscendNumber;
import by.itstep.khodosevich.fifthproject.view.Printer;
import java.util.Scanner;

public class ControllerAscendNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input your number: ");
        long number = scanner.nextLong();

        boolean result = AscendNumber.checkAscendNumber(number);

        String msg = String.format("Your number: %d - is ascend?"
                +"\nAnswer: %b", number, result);

        Printer.printToConsole(msg);
        scanner.close();
    }
}
