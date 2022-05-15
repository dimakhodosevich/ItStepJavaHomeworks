package by.itstep.khodosevich.fourteenstage.levelE.task08.controller;

import by.itstep.khodosevich.fourteenstage.levelE.module.Sum;
import by.itstep.khodosevich.fourteenstage.levelF.module.Array;
import by.itstep.khodosevich.fourteenstage.levelF.module.ZeroNumber;
import by.itstep.khodosevich.fourteenstage.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class ControllerLevelETask08 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Printer.print("Input size of your array: ");
            int size = scanner.nextInt();
            int[] array = Array.initArray(size);
            Printer.print("Your array is: " + Arrays.toString(array) + ".");
            int lastZeroIndex = ZeroNumber.findLastZeroElementIndex(array);

            if (lastZeroIndex == -1) {
                Printer.print("\nYour array doesn't has zero element.");
            } else {
                Printer.print("\nLast zero element is has index " + lastZeroIndex + ".");
                double sum = Sum.sumInt(array, lastZeroIndex + 1, array.length);
                Printer.print("\nThe sum from last zero element to the end of array is " + sum + ".");
            }

        } catch (Exception exception) {
            Printer.print("\nSomething went wrong!!! Look at stack trace.");
            Printer.print(exception.getStackTrace());
        }
    }

}
