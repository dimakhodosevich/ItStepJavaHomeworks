package by.itstep.khodosevich.fourteenstage.levelE.task05.controller;

import by.itstep.khodosevich.fourteenstage.levelE.module.Multiple;
import by.itstep.khodosevich.fourteenstage.levelE.module.Sum;
import by.itstep.khodosevich.fourteenstage.levelF.module.Array;
import by.itstep.khodosevich.fourteenstage.levelF.module.PositiveNumber;
import by.itstep.khodosevich.fourteenstage.levelF.module.ZeroNumber;
import by.itstep.khodosevich.fourteenstage.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class ControllerLevelETask05 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Printer.print("Input size of your array: ");
            int size = scanner.nextInt();
            int[] array = Array.initArray(size);
            Printer.print("Your array is: " + Arrays.toString(array) + ".");
            int firstPositiveIndex = PositiveNumber.findFirstPositiveElementIndex(array);
            int firstPositiveElement = array[firstPositiveIndex];
            int lastPositiveIndex = PositiveNumber.findLastPositiveElementIndex(array);
            int lastPositiveElement = array[lastPositiveIndex];


            if (lastPositiveIndex == -1 || firstPositiveIndex == -1) {
                Printer.print("\nYour array doesn't has positive element.");
            } else {
                Printer.print("\nFirst positive element is " + firstPositiveElement
                        + " and has index " + firstPositiveIndex + ".");
                Printer.print("\nLast positive element is " + lastPositiveElement
                        + " and has index " + lastPositiveIndex + ".");
                double sum = Sum.sumInt(array, firstPositiveElement + 1, lastPositiveIndex);
                Printer.print("\nThe sum from start to last positive element " + sum + ".");
            }

        } catch (Exception exception) {
            Printer.print("\nSomething went wrong!!! Look at stack trace.");
            Printer.print(exception.getStackTrace());
        }
    }

}
