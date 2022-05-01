package by.itstep.khodosevich.eightproject.task04.controller;

import by.itstep.khodosevich.eightproject.task03.view.Printer;
import java.util.Scanner;
import static by.itstep.khodosevich.eightproject.task04.module.Letter.*;

public class ControllerLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input your letter:");
        String line = scanner.next();
        char letter = line.charAt(0);

        String msg = String.format("%s", checkSymbol(letter));
        Printer.print(msg);

        scanner.close();
    }
}
