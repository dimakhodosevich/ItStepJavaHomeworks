package by.itstep.khodosevich.fourteenstage.levelF.task02.controller;

import by.itstep.khodosevich.fourteenstage.levelF.module.Array;
import by.itstep.khodosevich.fourteenstage.levelF.module.BubbleSort;
import by.itstep.khodosevich.fourteenstage.levelF.module.ZeroNumber;
import by.itstep.khodosevich.fourteenstage.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class ControllerLevelFTask02 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Printer.print("Input size of your array: ");
            int size = scanner.nextInt();
            int[] array = Array.initArray(size);
            Printer.print("Your array is: " + Arrays.toString(array));
            Printer.print("\nWhich type of action do you want to do?");
            Printer.print("\n1. Sort array by bubble sort method (ascend) to the first element equals 0;");
            Printer.print("\n2. Sort array by bubble sort method (ascend) to the last element equals 0.");
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

            String message1 = "Your array doesn't has 0 (zero) element!!!";
            String message2 = "Zero element has index ";

            if (variant == 1) {
                int firstIndex = ZeroNumber.findFirstZeroElementIndex(array);

                if (firstIndex == -1) {
                    Printer.printError(message1);
                } else {
                    message2 += firstIndex;
                    Printer.print(message2);
                    BubbleSort.bubbleSortAsc(array, 0, firstIndex - 1);
                    Printer.print("\n" + Arrays.toString(array));
                }

            } else {
                int lastIndex = ZeroNumber.findLastZeroElementIndex(array);

                if (lastIndex == -1) {
                    Printer.printError(message1);
                } else {
                    message2 += lastIndex;
                    Printer.print(message2);
                    BubbleSort.bubbleSortAsc(array, 0, lastIndex - 1);
                    Printer.print("\n" + Arrays.toString(array));
                }
            }
        } catch (Exception exception) {
            Printer.print("Something went wrong!!! Look at stack trace.");
            exception.getStackTrace();
        }

    }
}
