package by.itstep.khodosevich.sixproject.controller;

import by.itstep.khodosevich.sixproject.view.Printer;
import java.util.Scanner;
import static by.itstep.khodosevich.sixproject.module.logic.Parity.*;

public class ControllerParity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input your three number");
        System.out.printf("\nInput first number: ");
        int var1 = scanner.nextInt();
        System.out.printf("Input second number: ");
        int var2 = scanner.nextInt();
        System.out.printf("Input third number: ");
        int var3 = scanner.nextInt();

        String msg1 = String.format("Your first number: %d, is parity? Answer: %b.", var1, checkParityNumber(var1));
        String msg2 = String.format("\nYour second number: %d, is parity? Answer: %b.", var2, checkParityNumber(var2));
        String msg3 = String.format("\nYour third number: %d, is parity? Answer: %b.", var3, checkParityNumber(var3));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(msg1).append(msg2).append(msg3);

        String result = stringBuilder+"";

        Printer.printToConsole(result);

    scanner.close();
    }
}
