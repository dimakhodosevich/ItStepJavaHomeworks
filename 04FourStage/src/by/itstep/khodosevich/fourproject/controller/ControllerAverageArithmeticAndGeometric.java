package by.itstep.khodosevich.fourproject.controller;

import by.itstep.khodosevich.fourproject.module.logic.AverageArithmeticAndGeometric;
import by.itstep.khodosevich.fourproject.view.Printer;
import java.util.Scanner;

public class ControllerAverageArithmeticAndGeometric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input number_1 to calculate average arithmetic and geometric value: ");
        double value_1 = scanner.nextDouble();
        System.out.printf("Input number_1 to calculate average arithmetic and geometric value: ");
        double value_2 = scanner.nextDouble();

        String result = String.format("Average arithmetic value = %.2f and geometric value = %.2f."
                , AverageArithmeticAndGeometric.calculateAverageArithmeticValue(value_1, value_2)
                , AverageArithmeticAndGeometric.calculateAverageGeometricValue(value_1, value_2));

        Printer.printToConsole(result);
        scanner.close();
    }
}
