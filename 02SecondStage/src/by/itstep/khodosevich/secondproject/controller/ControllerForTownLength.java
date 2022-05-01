package by.itstep.khodosevich.secondproject.controller;

import by.itstep.khodosevich.secondproject.module.data.TownLength;
import by.itstep.khodosevich.secondproject.view.Printer;
import java.util.Scanner;

public class ControllerForTownLength {

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input length between to town in centimeter: ");
        long centimeter = scanner.nextLong();

        int meter = TownLength.translateCentimeterInMeter(centimeter);
        int kilometer = TownLength.translateMeterInKilometr(meter);

        String msg = String.format("%-20s %-20d %-20d"
                ,centimeter, meter, kilometer);

        System.out.printf("%-20s %-20s %-20s\n", "Centimeter:", "Meter:"
                , "Kilometer:");
        Printer.printToConsole(msg);

        scanner.close();
    }
}
