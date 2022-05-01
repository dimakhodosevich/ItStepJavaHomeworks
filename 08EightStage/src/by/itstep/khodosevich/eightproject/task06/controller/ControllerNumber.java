package by.itstep.khodosevich.eightproject.task06.controller;

import by.itstep.khodosevich.eightproject.task01.view.Printer;

import java.util.Scanner;
import static by.itstep.khodosevich.eightproject.task06.module.logic.Number.*;

public class ControllerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input your number from diapason (1<number<999):");
        int number = scanner.nextInt();

        String msg = String.format("Your number is %d.\n"+
                "Your number in text format is %s.", number, getStringNumber(number));

        Printer.print(msg);

        scanner.close();
    }
}
