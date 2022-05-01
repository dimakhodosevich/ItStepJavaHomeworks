package by.itstep.khodosevich.sixproject.controller;

import by.itstep.khodosevich.sixproject.view.Printer;
import java.util.Scanner;
import static by.itstep.khodosevich.sixproject.module.logic.OneParity.*;

public class ControllerOneParity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your tree number");
        System.out.print("\nInput first your number: ");
        int var1 = scanner.nextInt();
        System.out.print("Input second your number: ");
        int var2 = scanner.nextInt();
        System.out.print("Input third your number: ");
        int var3 = scanner.nextInt();

        String msg = String.format("Among your nubmers %d, %d, %d - are there only one parity number? "+
                "\nAnswer: %b.", var1, var2, var3, checkOneParityNumber(var1, var2, var3));

        Printer.printToConsole(msg);
    }

}
