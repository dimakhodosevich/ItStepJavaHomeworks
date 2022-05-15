package by.itstep.khodosevich.fourteenstage.levelE.task11.controller;

import by.itstep.khodosevich.fourteenstage.levelE.module.Array;
import by.itstep.khodosevich.fourteenstage.levelE.module.MaxAndMinIndex;
import by.itstep.khodosevich.fourteenstage.levelE.module.Sum;
import by.itstep.khodosevich.fourteenstage.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class ControllerLevelETask11 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Printer.print("Input size of your array: ");
            int size = scanner.nextInt();
            double[] array = Array.initArray(size);
            Printer.print("Your array is: " + Arrays.toString(array) + ".");
            int maxElementIndex = MaxAndMinIndex.getMaxElementIndex(array);
            double maxElement = array[maxElementIndex];

            Printer.print("\nMax element " + maxElement + " has index " + maxElementIndex + ".");
            double sum = Sum.sum(array, maxElementIndex+1, array.length);
            Printer.print("\nThe sum max element to the end array " + sum + ".");

        } catch (Exception exception) {
            Printer.print("\nSomething went wrong!!! Look at stack trace.");
            Printer.print(exception.getStackTrace());
        }
    }
}
