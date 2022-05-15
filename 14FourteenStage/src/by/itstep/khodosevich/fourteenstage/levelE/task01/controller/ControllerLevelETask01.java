package by.itstep.khodosevich.fourteenstage.levelE.task01.controller;


import by.itstep.khodosevich.fourteenstage.levelE.module.Array;
import by.itstep.khodosevich.fourteenstage.levelE.module.MaxAndMinIndex;
import by.itstep.khodosevich.fourteenstage.levelE.module.Sum;
import by.itstep.khodosevich.fourteenstage.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class ControllerLevelETask01 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Printer.print("Input size of your array: ");
            int size = scanner.nextInt();
            double[] array = Array.initArray(size);
            Printer.print("Your array is: " + Arrays.toString(array));
            int minIndex = MaxAndMinIndex.getMinElementIndex(array);
            int maxIndex = MaxAndMinIndex.getMaxElementIndex(array);
            double max = array[maxIndex];
            double min = array[minIndex];

            Printer.print("\nMax value " + max + ", has index " + maxIndex + ".");
            Printer.print("\nMin value " + min + ", has index " + minIndex + ".");

            double sum = maxIndex > minIndex
                    ? Sum.sum(array, minIndex + 1, maxIndex)
                    : Sum.sum(array, maxIndex + 1, minIndex);

            Printer.print("\nThe sum between max and min element is " + sum + ".");

        } catch (Exception exception) {
            Printer.print("\nSomething went wrong!!! Look at stack trace.");
            Printer.print(exception.getStackTrace());
        }
    }

}
