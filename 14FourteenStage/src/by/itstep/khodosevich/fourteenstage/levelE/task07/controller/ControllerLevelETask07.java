package by.itstep.khodosevich.fourteenstage.levelE.task07.controller;

import by.itstep.khodosevich.fourteenstage.levelE.module.Array;
import by.itstep.khodosevich.fourteenstage.levelE.module.MaxAndMinIndex;
import by.itstep.khodosevich.fourteenstage.levelE.module.Multiple;
import by.itstep.khodosevich.fourteenstage.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class ControllerLevelETask07 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Printer.print("Input size of your array: ");
            int size = scanner.nextInt();
            double[] array = Array.initArray(size);
            Printer.print("Your array is: " + Arrays.toString(array) + ".");
            int maxAbsIndex = MaxAndMinIndex.getMaxAbsElementIndex(array);
            double maxAbsElement = array[maxAbsIndex];

            if (maxAbsIndex == -1) {
                Printer.print("\nYour array doesn't match our condition.");
            } else {
                Printer.print("\nMax abs element  " + maxAbsElement
                        + " and has index " + maxAbsIndex + ".");
                double mult = Multiple.multiple(array, maxAbsIndex, array.length);
                Printer.print("\nThe multiple from max abs element to the end of array is " + mult + ".");
            }

        } catch (Exception exception) {
            Printer.print("\nSomething went wrong!!! Look at stack trace.");
            Printer.print(exception.getStackTrace());
        }
    }

}
