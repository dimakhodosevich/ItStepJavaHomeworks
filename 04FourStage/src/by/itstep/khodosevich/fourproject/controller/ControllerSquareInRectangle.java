package by.itstep.khodosevich.fourproject.controller;

import by.itstep.khodosevich.fourproject.module.logic.Rectangle;
import by.itstep.khodosevich.fourproject.module.logic.SquareInRectangle;
import by.itstep.khodosevich.fourproject.view.Printer;

import java.util.Scanner;

public class ControllerSquareInRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input length of rectangle: ");
        double lengthOfRectangle = scanner.nextDouble();
        System.out.printf("Input width of rectangle: ");
        double widthOfRectangle = scanner.nextDouble();

        System.out.printf("Input length of square: ");
        double lengthOfSquare = scanner.nextDouble();

        int squareInLengthOfRectangle
                = SquareInRectangle.calculateSquareInLength(lengthOfRectangle, lengthOfSquare);
        int squareInWidthOfRectangle
                = SquareInRectangle.calculateSquareInWidth(widthOfRectangle, lengthOfSquare);
        int squareInRectangle = squareInLengthOfRectangle*squareInWidthOfRectangle;


        double squareOfRectangle
                = Rectangle.calculateSquareOfRectangle(lengthOfRectangle, widthOfRectangle);
        double squareOfSquare
                = Rectangle.calculateSquareOfRectangle(lengthOfSquare, lengthOfSquare);
        double emptySquare
                = squareOfRectangle-squareInRectangle*squareOfSquare;

        String msg = String.format("In rectangle with length %.2f and width %.2f,"
        +"you can put %d square with size %.2f, and rectagle will be have %.2f empty square."
                , lengthOfRectangle, widthOfRectangle, squareInRectangle, lengthOfSquare, emptySquare);

        Printer.printToConsole(msg);

        scanner.close();
    }
}
