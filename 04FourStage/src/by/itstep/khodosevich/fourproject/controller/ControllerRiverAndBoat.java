package by.itstep.khodosevich.fourproject.controller;

import by.itstep.khodosevich.fourproject.module.logic.RiverAndBoat;
import by.itstep.khodosevich.fourproject.view.Printer;
import java.util.Scanner;

public class ControllerRiverAndBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input velocity of boat: ");
        double velocityBoat = scanner.nextDouble();
        System.out.printf("Input velocity of river (boatVelocity>riverVelocity): ");
        double velocityRiver = scanner.nextDouble();
        System.out.printf("Input time which boat rode on the flow: ");
        double timeOnTheFlow = scanner.nextDouble();
        System.out.printf("Input time which boat rode against the flow: ");
        double timeAgainstTheFlow = scanner.nextDouble();

        double completeVelocityOnTheFlow
                = RiverAndBoat.calculateVelocityRiverAndBoat(velocityRiver, velocityBoat);
        double completeVelocityAgainstTheFlow
                = RiverAndBoat.calculateVelocityRiverAndBoat(-velocityRiver, velocityBoat);

        double completeDistanceOnTheFlow
                = RiverAndBoat.calculateDistanceWhichBoatRide(completeVelocityOnTheFlow, timeOnTheFlow);
        double completeDistanceAgainstTheFlow
                = RiverAndBoat.calculateDistanceWhichBoatRide(completeVelocityAgainstTheFlow, timeAgainstTheFlow);

        double allDistance
                = RiverAndBoat.calculateAllDistance(completeDistanceAgainstTheFlow, completeDistanceOnTheFlow);

        String msg = String.format("Boat has %.2f velocity, river has %.2f velocity," +
                        " time which boat rode on the flow %.2f,"+ " time which boat rode against the flow %.2f." +
                        "\nAnswer: boat rode on the flow %.2f and against the flow %.2f, result = %.2f."
                , velocityBoat, velocityRiver, timeOnTheFlow, timeAgainstTheFlow
                , completeDistanceOnTheFlow, completeDistanceAgainstTheFlow, allDistance);


       Printer.printToConsole(msg);
        scanner.close();
    }
}
