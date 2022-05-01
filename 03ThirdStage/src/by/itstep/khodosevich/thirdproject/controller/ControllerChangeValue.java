package by.itstep.khodosevich.thirdproject.controller;

import java.util.Scanner;

public class ControllerChangeValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input a =");
        int a = scanner.nextInt();
        System.out.printf("Input b =");
        int b = scanner.nextInt();

        a = a+b;
        b = a-b;
        a -=b;

        System.out.printf("Value a = %d",a );
        System.out.printf("\nValue b = %d",b );
    }
}
