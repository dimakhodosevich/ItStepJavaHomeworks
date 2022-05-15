package by.itstep.khodosevich.fourteenstage.levelE.task13.controller;

import by.itstep.khodosevich.fourteenstage.levelE.module.Sum;
import by.itstep.khodosevich.fourteenstage.levelF.module.Array;
import by.itstep.khodosevich.fourteenstage.levelF.module.NegativeNumber;
import by.itstep.khodosevich.fourteenstage.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class ControllerLevelETask13 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Printer.print("Input size of your array: ");
            int size = scanner.nextInt();
            int[] array = Array.initArray(size);
            Printer.print("Your array is: " + Arrays.toString(array) + ".");
            int firstNegativeIndex = NegativeNumber.findFirstNegativeElementIndex(array);
            int lastNegativeIndex = NegativeNumber.findLastNegativeElementIndex(array);

            if (firstNegativeIndex == -1 || lastNegativeIndex == -1) {
                Printer.print("\nYour array doesn't has positive element.");
            } else {
                int firstNegativeElement = array[firstNegativeIndex];
                int lastNegativeElement = array[lastNegativeIndex];
                Printer.print("\nFirst negative element is " + firstNegativeElement
                        + " and has index " + firstNegativeIndex + ".");
                Printer.print("\nLast positive element is " + lastNegativeElement
                        + " and has index " + lastNegativeIndex + ".");
                double sum = Sum.sumInt(array, firstNegativeIndex + 1, lastNegativeIndex);
                Printer.print("\nThe sum from start to last positive element " + sum + ".");
            }

        } catch (Exception exception) {
            Printer.print("\nSomething went wrong!!! Look at stack trace.");
            Printer.print(exception.getStackTrace());
        }
    }

}
