package by.itstep.khodosevich.shopproject.controller;

import by.itstep.khodosevich.shopproject.model.entity.Bread;
import by.itstep.khodosevich.shopproject.model.entity.Milk;
import by.itstep.khodosevich.shopproject.model.entity.Orange;
import by.itstep.khodosevich.shopproject.model.entity.container.Basket;

public class Main {
    public static void main(String[] args) {
        Orange orange = new Orange(10, 55, 22);
        Orange orange2 = new Orange(15, 54, 22);
        Orange orange3 = new Orange(20, 30, 22);
        Milk milk = new Milk(10, 50, 60 );
        Bread bread = new Bread("white", "red", 50  );

        Basket basket = new Basket();
        basket.add(orange);
        basket.add(orange2);
        basket.add(orange3);
        basket.add(bread);
        basket.add(milk);

        System.out.print(basket);
    }
}
