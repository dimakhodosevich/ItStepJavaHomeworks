package by.itstep.khodosevich.shopproject.controller;

import by.itstep.khodosevich.shopproject.model.entity.Bread;
import by.itstep.khodosevich.shopproject.model.entity.Milk;
import by.itstep.khodosevich.shopproject.model.entity.Orange;

public class Main {
    public static void main(String[] args) {
        Orange orange = new Orange(10, 55, 22);
        System.out.print(orange);
        Milk milk = new Milk(10, 50, 60 );
        System.out.print(milk);
        Bread bread = new Bread("white", "red", 50  );
        System.out.print(bread);;
    }
}
