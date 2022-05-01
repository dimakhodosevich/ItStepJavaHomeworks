package by.itstep.khodosevich.fourproject.controller;

import by.itstep.khodosevich.fourproject.module.logic.Point;
import by.itstep.khodosevich.fourproject.module.logic.SimpleLinearEquation;
import by.itstep.khodosevich.fourproject.view.Printer;

import java.util.Scanner;

public class ControllerSimpleLinearEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input parameters simple liner equation Ax+B=0 where (A>0). ");
        System.out.printf("Input A: ");
        double a = scanner.nextDouble();
        System.out.printf("Input B: ");
        double b = scanner.nextDouble();

        String result = String.format("Root of the equation %.2fx+%.2f=0 equals x = %.2f"
                , a,b, SimpleLinearEquation.resolveSimpleLinerEquation(a,b));

        Printer.printToConsole(result);
        scanner.close();
    }

}
