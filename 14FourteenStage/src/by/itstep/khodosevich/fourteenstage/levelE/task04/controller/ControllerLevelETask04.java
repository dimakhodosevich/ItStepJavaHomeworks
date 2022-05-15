package by.itstep.khodosevich.fourteenstage.levelE.task04.controller;

import by.itstep.khodosevich.fourteenstage.levelE.module.Multiple;
import by.itstep.khodosevich.fourteenstage.levelF.module.Array;
import by.itstep.khodosevich.fourteenstage.levelF.module.ZeroNumber;
import by.itstep.khodosevich.fourteenstage.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class ControllerLevelETask04 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Printer.print("Input size of your array: ");
            int size = scanner.nextInt();
            int[] array = Array.initArray(size);
            Printer.print("Your array is: " + Arrays.toString(array) + ".");
            int firstZeroIndex = ZeroNumber.findFirstZeroElementIndex(array);
            int lastZeroIndex = ZeroNumber.findLastZeroElementIndex(array);

            if (firstZeroIndex == -1 || lastZeroIndex == -1 || firstZeroIndex==lastZeroIndex) {
                Printer.print("\nYour array doesn't match our condition.");
            } else {
                double mult = Multiple.multipleInt(array, firstZeroIndex+1, lastZeroIndex);
                Printer.print("\nThe multiple between first and last elements equals zero " + mult + ".");
            }

        } catch (Exception exception) {
            Printer.print("\nSomething went wrong!!! Look at stack trace.");
            Printer.print(exception.getStackTrace());
        }
    }

}
