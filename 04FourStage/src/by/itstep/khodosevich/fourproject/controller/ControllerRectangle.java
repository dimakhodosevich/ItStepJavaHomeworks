package by.itstep.khodosevich.fourproject.controller;

import by.itstep.khodosevich.fourproject.module.logic.Rectangle;
import by.itstep.khodosevich.fourproject.view.Printer;

import java.util.Scanner;

public class ControllerRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.printf("Input width of rectangle: ");
        double width = scanner.nextDouble();

        String result = String.format("Square of your rectangle = %.2f and perimeter = %.2f."
                , Rectangle.calculateSquareOfRectangle(length, width)
                , Rectangle.calculatePerimeterOfRectangle(length,width));

        Printer.printToConsole(result);
        scanner.close();
    }
}
