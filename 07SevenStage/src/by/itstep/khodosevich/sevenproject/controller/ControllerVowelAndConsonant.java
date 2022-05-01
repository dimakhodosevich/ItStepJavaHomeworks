package by.itstep.khodosevich.sevenproject.controller;

import by.itstep.khodosevich.sevenproject.view.Printer;
import java.util.Scanner;
import static by.itstep.khodosevich.sevenproject.module.logic.VowelAndConsonant.*;

public class ControllerVowelAndConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your latter: ");
        String msg = scanner.next();
        char letter = msg.charAt(0);

        boolean result = checkLetter(letter);

        msg = String.format("Your letter '%c' is vowel?\nAnswer: %b", letter, result);
        Printer.printToConsole(msg);

        scanner.close();
    }
}
