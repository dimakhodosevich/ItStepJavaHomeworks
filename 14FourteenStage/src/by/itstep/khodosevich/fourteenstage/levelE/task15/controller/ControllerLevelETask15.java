package by.itstep.khodosevich.fourteenstage.levelE.task15.controller;

import by.itstep.khodosevich.fourteenstage.levelE.module.Array;
import by.itstep.khodosevich.fourteenstage.levelE.module.MaxAndMinIndex;
import by.itstep.khodosevich.fourteenstage.levelE.module.Sum;
import by.itstep.khodosevich.fourteenstage.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class ControllerLevelETask15 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Printer.print("Input size of your array: ");
            int size = scanner.nextInt();
            double[] array = Array.initArray(size);
            Printer.print("Your array is: " + Arrays.toString(array) + ".");
            int minElementIndex = MaxAndMinIndex.getMinElementIndex(array);
            double minElement = array[minElementIndex];

            Printer.print("\nMin element " + minElement + " has index " + minElementIndex + ".");
            double sum = Sum.sum(array, minElementIndex+1, array.length);
            Printer.print("\nThe sum from min element to the end of array " + sum + ".");

        } catch (Exception exception) {
            Printer.print("\nSomething went wrong!!! Look at stack trace.");
            Printer.print(exception.getStackTrace());
        }
    }

}
