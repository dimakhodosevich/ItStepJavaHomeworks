package by.itstep.khodosevich.fifthproject.controller;

import by.itstep.khodosevich.fifthproject.module.logic.Coordinate;
import by.itstep.khodosevich.fifthproject.view.Printer;
import java.util.Scanner;

public class ControllerCoordinate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.printf("Input coordinate of your point\n");
        System.out.printf("Coordinate x: ");
        int x = scanner.nextInt();
        System.out.printf("Coordinate y: ");
        int y = scanner.nextInt();

        int result = Coordinate.checkCoordinate(x,y);

        String msg = String.format("Your point with coordinate x=%d, y=%d"
                + "\nlocated at: %d part of coordinate board.", x,y,result);

        Printer.printToConsole(msg);
        scanner.close();
    }

}
