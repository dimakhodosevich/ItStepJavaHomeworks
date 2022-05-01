package by.itstep.khodosevich.elevenstageproject.task03.controller;

import by.itstep.khodosevich.elevenstageproject.view.Printer;

import java.util.Scanner;

import static by.itstep.khodosevich.elevenstageproject.task03.logic.module.HeadsAndTails.*;

public class ControllerHeadsAndTails {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Printer.print("Input amount of bet coin cycle: ");
        int amount = SCANNER.nextInt();
        double head = getStatisticOfHead(amount);
        String msg = String.format("Your coin showed %.2f times of heads and %.2f of tail.",
                head, 1 - head);
        Printer.print(msg);
    }
}
