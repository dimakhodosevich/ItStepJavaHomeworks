package by.itstep.khodosevich.nineproject.task01.controller;

import by.itstep.khodosevich.nineproject.task01.view.Printer;
import static by.itstep.khodosevich.nineproject.task01.module.SimplePoker.*;
import java.util.Scanner;

public class ControllerPoker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );

        Printer.print("Введите количестко игроков в покер (от 2 до 10 человек):");
        int player = scanner.nextInt();

        String msg = playCard(player);

        Printer.print(msg);
        scanner.close();

    }
}
