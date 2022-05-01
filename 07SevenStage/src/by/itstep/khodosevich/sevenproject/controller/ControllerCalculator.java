package by.itstep.khodosevich.sevenproject.controller;

import by.itstep.khodosevich.sevenproject.view.Printer;

import java.util.Scanner;
import static by.itstep.khodosevich.sevenproject.module.logic.Calculator.*;

public class ControllerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input which action on calculator would you like to do:");
        System.out.println("1 - '+'. Input '+' sing.");
        System.out.println("2 - '-'. Input '-' sing.");
        System.out.println("3 - '*'. Input '*' sing.");
        System.out.println("4 - '/'. Input '/' sing.");
        System.out.println("5 - '%'. Input '%' sing.");
        String msg = scanner.next();
        char sing = msg.charAt(0);
        System.out.println("Input two arguments for calculator.");
        System.out.println("First argument:");
        double var1 = scanner.nextDouble();
        System.out.println("Second argument:");
        double var2 = scanner.nextDouble();

        msg = String.format("You chose %c operation and input %.2f and %.2f arguments. Result = %.2f."
                , sing, var1, var2, calculate(sing, var1, var2));

        Printer.printToConsole(msg);

        scanner.close();
    }
}
