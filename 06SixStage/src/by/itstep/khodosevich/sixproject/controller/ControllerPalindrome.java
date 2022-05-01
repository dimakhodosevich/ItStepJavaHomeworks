package by.itstep.khodosevich.sixproject.controller;

import by.itstep.khodosevich.sixproject.view.Printer;
import java.util.Scanner;
import static by.itstep.khodosevich.sixproject.module.logic.Palindrome.*;

public class ControllerPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input your number:");
        long var1 = scanner.nextLong();
        boolean isPalindrome = checkPalindrome(var1);

        String msg = String.format("Your number %d - is palindrome?"
        +"\nAnswer: %b", var1, isPalindrome);

        Printer.printToConsole(msg);

        scanner.close();
    }

}
