package by.itstep.khodosevich.shopproject.model.entity;

import by.itstep.khodosevich.shopproject.model.entity.abstracts.Product;

public class Milk extends Product {
    private double fat;
    private double volume;

    public Milk() {
    }

    public Milk(double volume, double fat, double price) {
        super(price);
        this.fat = fat;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public double getFat() {
        return fat;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Milk: " +
                "volume = " + volume +
                ", fat = " + fat +
                super.toString()+";\n";
    }
}
