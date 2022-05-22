package by.itstep.khodosevich.shopproject.model.entity;

public class Bread {
    private String color;
    private String flour;
    private double price;

    public Bread() {
    }

    public Bread(String color, String flour, double price) {
        this.color = color;
        this.flour = flour;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public String getFlour() {
        return flour;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bread: " +
                "color = " + color +
                ", flour = " + flour +
                ", price = " + price +";\n";
    }
}
