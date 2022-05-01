package by.itstep.khodosevich.nineproject.task03.controller;

import by.itstep.khodosevich.nineproject.task01.view.Printer;

import java.util.Scanner;
import static by.itstep.khodosevich.nineproject.task03.module.logic.Dice.*;

public class ControllerDice
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );

        Printer.print("Player throw the dice...\n");
        int first_number = generateDicePoint();
        int second_number = generateDicePoint();
        String msg = String.format("Player has %d point(s): first dice - %d, second dice - %d",
                calculateDicePoint(first_number,second_number), first_number, second_number);

        Printer.print(msg);
        scanner.close();

    }
}
