package by.itstep.khodosevich.fourteenstage.levelE.task06.controller;

import by.itstep.khodosevich.fourteenstage.levelE.module.Sum;
import by.itstep.khodosevich.fourteenstage.levelF.module.Array;
import by.itstep.khodosevich.fourteenstage.levelF.module.PositiveNumber;
import by.itstep.khodosevich.fourteenstage.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class ControllerLevelETask06 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Printer.print("Input size of your array: ");
            int size = scanner.nextInt();
            int[] array = Array.initArray(size);
            Printer.print("Your array is: " + Arrays.toString(array) + ".");
            int firstPositiveIndex = PositiveNumber.findFirstPositiveElementIndex(array);
            int firstPositiveElement = array[firstPositiveIndex];

            if (firstPositiveIndex == -1) {
                Printer.print("\nYour array doesn't has positive element.");
            } else {
                Printer.print("\nFirst positive element is " + firstPositiveElement
                        + " and has index " + firstPositiveIndex + ".");
                double sum = Sum.sumInt(array, firstPositiveIndex+1, array.length);
                Printer.print("\nThe sum from first positive element to the end of array is " + sum + ".");
            }

        } catch (Exception exception) {
            Printer.print("\nSomething went wrong!!! Look at stack trace.");
            Printer.print(exception.getStackTrace());
        }
    }

}
