package by.itstep.khodosevich.sevenproject.controller;

import by.itstep.khodosevich.sevenproject.view.Printer;
import java.util.Scanner;
import static by.itstep.khodosevich.sevenproject.module.logic.QuadraticEquation.*;

public class ControllerQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input arguments for quadratic equation ax^2+bx+c=0.");
        System.out.printf("Input argument a: ");
        double a = scanner.nextDouble();
        System.out.printf("Input argument b: ");
        double b = scanner.nextDouble();
        System.out.printf("Input argument c: ");
        double c = scanner.nextDouble();

        String result = resolveQuadraticEquation(a, b, c);

        Printer.printToConsole(result);
        scanner.close();
    }
}
