package by.itstep.khodosevich.fourteenstage.levelF.task07.controller;

import by.itstep.khodosevich.fourteenstage.levelF.module.*;
import by.itstep.khodosevich.fourteenstage.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class ControllerLevelFTask07 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Printer.print("Input size of your array: ");
            int size = scanner.nextInt();
            int[] array = Array.initArray(size);
            Printer.print("Your array is: " + Arrays.toString(array));
            Printer.print("\nWhich type of action do you want to do?");
            Printer.print("\n1. Sort array by quick sort method (descend) to the first parity element;");
            Printer.print("\n2. Sort array by quick sort method (descend) to the last parity element.");
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

            String message1 = "Your array doesn't has parity element!!!";
            String message2 = "Parity element has index ";

            if (variant == 1) {
                int firstIndex = ParityNumber.findFirstParityElementIndex(array);

                if (firstIndex == -1) {
                    Printer.printError(message1);
                } else {
                    message2 += firstIndex;
                    Printer.print(message2);
                    firstIndex = firstIndex == 0 ? ++firstIndex : firstIndex;
                    QuickSort.quickSortDes(array, 0, firstIndex - 1);
                    Printer.print("\n" + Arrays.toString(array));
                }

            } else {
                int lastIndex = ParityNumber.findLastParityElementIndex(array);

                if (lastIndex == -1) {
                    Printer.printError(message1);
                } else {
                    message2 += lastIndex;
                    Printer.print(message2);
                    QuickSort.quickSortDes(array, 0, lastIndex - 1);
                    Printer.print("\n" + Arrays.toString(array));
                }
            }
        } catch (Exception exception) {
            Printer.print("\nSomething went wrong!!! Look at stack trace.");
            Printer.print(exception.getStackTrace());
        }

    }
}
