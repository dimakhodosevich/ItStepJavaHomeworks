package by.itstep.khodosevich.sixproject.controller;

import by.itstep.khodosevich.sixproject.view.Printer;
import java.util.Scanner;
import static by.itstep.khodosevich.sixproject.module.logic.Coordinate.*;

public class ControllerCoordinate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input first coordinate of your rectangle (x1,y1)");
        System.out.printf("I\nnput x1: ");
        int x1 = scanner.nextInt();
        System.out.printf("Input y1: ");
        int y1 = scanner.nextInt();
        System.out.printf("Input second coordinate of your rectangle (x2,y2)");
        System.out.printf("I\nnput x2: ");
        int x2 = scanner.nextInt();
        System.out.printf("Input y2: ");
        int y2 = scanner.nextInt();
        System.out.printf("Input third coordinate of your point which you want to know: " +
                "is it located at the your rectangle (x3, y3)?");
        System.out.printf("I\nnput x3: ");
        int point_x3 = scanner.nextInt();
        System.out.printf("Input y3: ");
        int point_y3 = scanner.nextInt();

        boolean result = checkCoordinate(x1, y1, x2, y2, point_x3, point_y3);

        String msg = String.format("Is your point (x3 = %d, y3 = %d) " +
                "located at the your rectangle (x1 = %d, y1 = %d, x2 = %d, y2 = %d)?" +
                "\nAnswer: %b.",point_x3, point_y3, x1, y1, x2, y2, result);

        Printer.printToConsole(msg);

        scanner.close();
    }
}
