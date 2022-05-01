package by.itstep.khodosevich.secondproject.controller;

import by.itstep.khodosevich.secondproject.module.data.Storage;
import by.itstep.khodosevich.secondproject.view.Printer;
import java.util.Scanner;

public class ControllerForStorage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input size of your file in byte: ");
        long bytee = scanner.nextLong();

        long kilobyte = Storage.translateByteIntoKilobyte(bytee);
        int megabyte = Storage.translateKilobyteIntoMegabyte(kilobyte);
        int gigabyte = Storage.translateMegabyteIntoGigabyte(megabyte);
        int terabyte = Storage.translateGigabyteIntoTerabyte(gigabyte);

        String msg = String.format("%-20s %-20d %-20d %-20d %-20d",
                bytee, kilobyte, megabyte, gigabyte, terabyte);

        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "Byte:", "Kilobyte:"
                , "Megabyte:", "Gigabyte:", "Terabyte:");
        Printer.printToConsole(msg);

        scanner.close();
    }
}
