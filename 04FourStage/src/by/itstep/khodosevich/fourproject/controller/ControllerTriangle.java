package by.itstep.khodosevich.fourproject.controller;

import by.itstep.khodosevich.fourproject.module.logic.Triangle;
import by.itstep.khodosevich.fourproject.view.Printer;
import java.util.Scanner;

public class ControllerTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input length of triangle: ");
        double length = scanner.nextDouble();
        System.out.printf("Input width of triangle: ");
        double width = scanner.nextDouble();

        String result = String.format("Square of your triangle = %.2f, perimeter = %.2f and hypotenuse = %.2f."
                , Triangle.calculateSquareOfTriangle(length, width)
                , Triangle.calculatePerimeterOfTriangle(length,width)
                , Triangle.calculateHypotenuseOfTriangle(length, width));

        Printer.printToConsole(result);
        scanner.close();

    }
}
