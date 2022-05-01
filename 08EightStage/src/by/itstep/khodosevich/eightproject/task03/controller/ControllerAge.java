package by.itstep.khodosevich.eightproject.task03.controller;

import by.itstep.khodosevich.eightproject.task03.view.Printer;
import static by.itstep.khodosevich.eightproject.task03.module.logic.Age.*;
import java.util.Scanner;

public class ControllerAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Введите ваш возраст (0<возраст<121):");
        int age = scanner.nextInt();

        String msg = String.format("Вам: %s.", getStringAge(age));
        Printer.print(msg);

        scanner.close();
    }
}
