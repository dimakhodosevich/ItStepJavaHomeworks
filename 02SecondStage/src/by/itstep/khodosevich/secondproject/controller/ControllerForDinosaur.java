package by.itstep.khodosevich.secondproject.controller;

import by.itstep.khodosevich.secondproject.module.data.Dinosaur;
import by.itstep.khodosevich.secondproject.view.Printer;

import static by.itstep.khodosevich.secondproject.module.data.Dinosaur.*;

import java.util.Scanner;

public class ControllerForDinosaur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dinosaur dinosaur1 = new Dinosaur();

        System.out.printf("Input weight of dinosaur in gramm: ");
        long gramm = scanner.nextLong();
        dinosaur1.setWeight(gramm);

        System.out.printf("Input name of dinosaur: ");
        String name = scanner.next();
        dinosaur1.setName(name);

        int killogramm = translateGrammToKillogramm(dinosaur1.getWeight());
        int centner = translateKillogrammToCentner(killogramm);
        int ton = translateCentnerToTon(centner);

        String msg = String.format("%-20s %-25d %-25d %-25d %-25d",
                dinosaur1.getName(), dinosaur1.getWeight(),
                killogramm, centner, ton);

        System.out.printf("%-20s %-25s %-25s %-25s %-25s\n", "Dinosaur name:", "Weight in gramm"
                , "Weight in killogramm", "Weight in centner", "Weight in ton");
        Printer.printToConsole(msg);

        scanner.close();
    }
}
