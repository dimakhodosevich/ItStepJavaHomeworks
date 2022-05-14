package by.itstep.khodosevich.fourteenstage.levelF.task06.controller;

import by.itstep.khodosevich.fourteenstage.levelF.module.Array;
import by.itstep.khodosevich.fourteenstage.levelF.module.InsertSort;
import by.itstep.khodosevich.fourteenstage.levelF.module.PositiveNumber;
import by.itstep.khodosevich.fourteenstage.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class ControllerLevelFTask06 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Printer.print("Input size of your array: ");
            int size = scanner.nextInt();
            int[] array = Array.initArray(size);
            Printer.print("Your array is: " + Arrays.toString(array));
            Printer.print("\nWhich type of action do you want to do?");
            Printer.print("\n1. Sort array by insert sort method (ascend) to the first positive element;");
            Printer.print("\n2. Sort array by insert sort method (ascend) to the last positive element.");
            Printer.print("\nPush only first of second number!!!\n");

            int variant;
            while (true) {
                Printer.print("Input your variant: ");
                variant = scanner.nextInt();
                scanner.nextLine();
                if (variant == 1 || variant == 2) {
                    break;
                }
            }

            String message1 = "Your array doesn't has positive element!!!";
            String message2 = "Positive element has index ";

            if (variant == 1) {
                int firstIndex = PositiveNumber.findFirstPositiveElementIndex(array);

                if (firstIndex == -1) {
                    Printer.printError(message1);
                } else {
                    message2 += firstIndex;
                    Printer.print(message2);
                    InsertSort.insertSortAsc(array, 0, firstIndex - 1);
                    Printer.print("\n" + Arrays.toString(array));
                }

            } else {
                int lastIndex = PositiveNumber.findLastPositiveElementIndex(array);

                if (lastIndex == -1) {
                    Printer.printError(message1);
                } else {
                    message2 += lastIndex;
                    Printer.print(message2);
                    InsertSort.insertSortAsc(array, 0, lastIndex - 1);
                    Printer.print("\n" + Arrays.toString(array));
                }
            }
        } catch (Exception exception) {
            Printer.print("Something went wrong!!! Look at stack trace.");
            exception.getStackTrace();
        }

    }

}
