package by.itstep.khodosevich.fourproject.controller;

import by.itstep.khodosevich.fourproject.module.logic.AverageArithmeticAndGeometric;
import by.itstep.khodosevich.fourproject.module.logic.Point;
import by.itstep.khodosevich.fourproject.view.Printer;

import java.util.Scanner;

public class ControllerPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First coordinates of point: ");
        System.out.printf("Input point x1: ");
        double x1 = scanner.nextDouble();
        System.out.printf("Input point y1: ");
        double y1 = scanner.nextDouble();
        System.out.println("Second coordinates of point: ");
        System.out.printf("Input point x2: ");
        double x2 = scanner.nextDouble();
        System.out.printf("Input point y2: ");
        double y2 = scanner.nextDouble();

        double x = Point.calculatePointX(x1, x2);
        double y = Point.calculatePointY(y1, y2);
        double distance = Point.findDistanceBetweenTwoPoint(x,y);

        String result = String.format("Distance between point 1(%.2f, %.2f) and point 2(%.2f, %.2f) = %.2f"
                , x1, y1, x2, y2, distance);

        Printer.printToConsole(result);
        scanner.close();
    }
}
