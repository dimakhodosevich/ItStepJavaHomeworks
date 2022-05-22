package by.itstep.khodosevich.shopproject.model.entity.container;

import by.itstep.khodosevich.shopproject.model.entity.Milk;
import by.itstep.khodosevich.shopproject.model.entity.abstracts.Product;


public class Basket {
    private Product[] products;

    public Basket() {
        products = new Product[0];
    }

    public Basket(Product[] products) {
        this();

        if (products == null) {
            products = new Milk[0];
        }

        this.products = products;
    }

    public void add(Product product) {
        if (product == null) {
            return;
        }

        Product[] temp = new Product[products.length + 1];
        int i = 0;
        for (; i < products.length; i++) {
            temp[i] = products[i];
        }

        temp[i] = product;
        products = temp;
    }

    public void remove(int index) {
        Product[] temp = new Product[products.length - 1];


        for (int i = 0, j = 0; i < products.length; i++) {
            if (i != index) {
                temp[j++] = products[i];
            }
        }

        products = temp;
    }

    public int getProductCount() {
        return products.length;
    }

    //    !!!
    public Product getProduct(int index) {
        return products[index];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        String msg = "Your basket is empty!!!\n";

        if (products.length == 0) {
            builder.append(msg);
        } else {

            msg = "Your basket has: \n";
            builder.append(msg);

            for (int i = 0; i < products.length; i++) {
                builder.append(products[i]);
            }
        }

        return builder + "";
    }
}
