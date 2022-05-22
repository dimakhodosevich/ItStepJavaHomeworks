package by.itstep.khodosevich.shopproject.model.entity.container;

import by.itstep.khodosevich.shopproject.model.entity.Bread;
import by.itstep.khodosevich.shopproject.model.entity.Milk;
import by.itstep.khodosevich.shopproject.model.entity.Orange;

import java.util.Arrays;

public class Basket {
    private Milk[] milks;
    private Bread[] breads;
    private Orange[] oranges;

    public Basket() {
        milks = new Milk[0];
        breads = new Bread[0];
        oranges = new Orange[0];
    }

    public Basket(Milk[] milks, Bread[] breads, Orange[] oranges) {
        this();

        if (milks == null) {
            milks = new Milk[0];
        }

        if (breads == null) {
            breads = new Bread[0];
        }

        if (oranges == null) {
            oranges = new Orange[0];
        }

        this.milks = milks;
        this.breads = breads;
        this.oranges = oranges;
    }

    public void addOrange(Orange orange) {
        Orange[] temp = new Orange[oranges.length + 1];
        int i = 0;
        for (; i < oranges.length; i++) {
            temp[i] = oranges[i];
        }

        temp[i] = orange;
        oranges = temp;
    }

    public void removeOrange(int index) {
        Orange[] temp = new Orange[oranges.length - 1];


        for (int i = 0, j = 0; i < oranges.length; i++) {
            if (i != index) {
                temp[j++] = oranges[i];
            }
        }

        oranges = temp;
    }

    public void addBread(Bread bread) {
        Bread[] temp = new Bread[breads.length + 1];
        int i = 0;
        for (; i < breads.length; i++) {
            temp[i] = breads[i];
        }

        temp[i] = bread;
        breads = temp;
    }

    public void removeBread(int index) {
        Bread[] temp = new Bread[breads.length - 1];

        for (int i = 0, j = 0; i < breads.length; i++) {
            if (i != index) {
                temp[j++] = breads[i];
            }
        }

        breads = temp;
    }

    public void addMilk(Milk milk) {
        Milk[] temp = new Milk[milks.length + 1];
        int i = 0;
        for (; i < milks.length; i++) {
            temp[i] = milks[i];
        }

        temp[i] = milk;
        milks = temp;
    }

    public void removeMilk(int index) {
        Milk[] temp = new Milk[milks.length - 1];


        for (int i = 0, j = 0; i < milks.length; i++) {
            if (i != index) {
                temp[j++] = milks[i];
            }
        }

        milks = temp;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        String msg = "Your basket is empty!!!\n";

        if (oranges == null || milks == null || breads == null
                || (oranges.length == 0 && milks.length == 0 && breads.length == 0)) {
            builder.append(msg);
        } else {

            msg = "Your basket has: \n";
            builder.append(msg);

            for (int i = 0; i < oranges.length; i++) {
                builder.append(oranges[i]);
            }

            for (int i = 0; i < milks.length; i++) {
                builder.append(milks[i]);
            }

            for (int i = 0; i < breads.length; i++) {
                builder.append(breads[i]);
            }
        }

        return builder + "";
    }
}
