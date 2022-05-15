package by.itstep.khodosevich.fourteenstage.levelE.task02.controller;

import by.itstep.khodosevich.fourteenstage.levelE.module.Sum;
import by.itstep.khodosevich.fourteenstage.levelF.module.Array;
import by.itstep.khodosevich.fourteenstage.levelF.module.ZeroNumber;
import by.itstep.khodosevich.fourteenstage.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class ControllerLevelETask02 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Printer.print("Input size of your array: ");
            int size = scanner.nextInt();
            int[] array = Array.initArray(size);
            Printer.print("Your array is: " + Arrays.toString(array) + ".");
            int firstZeroIndex = ZeroNumber.findFirstZeroElementIndex(array);
            int lastZeroIndex = ZeroNumber.findLastZeroElementIndex(array);

            if (firstZeroIndex == -1 || lastZeroIndex == -1) {
                Printer.print("\nYour array doesn't match our condition.");
            } else {
                double sum = Sum.sumInt(array, firstZeroIndex, lastZeroIndex);
                Printer.print("\nThe sum between first and last elements equals zero " + sum + ".");
            }

        } catch (Exception exception) {
            Printer.print("\nSomething went wrong!!! Look at stack trace.");
            Printer.print(exception.getStackTrace());
        }
    }

}
