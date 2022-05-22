package by.itstep.khodosevich.shopproject.model.logic;

import by.itstep.khodosevich.shopproject.model.entity.container.Basket;

public class ShopAssistance {
    private ShopAssistance() {
    }

    public static double calculateTotalPrice(Basket basket){
        double total = 0;

        for(int i = 0; i<basket.getMIlkSize(); i++){
            total+=basket.getMilk(i).getMoney();
        }

        for(int i = 0; i<basket.getBreadSize(); i++){
            total+=basket.getBread(i).getPrice();
        }

        for(int i = 0; i<basket.getOrangeSize(); i++){
            total+=basket.getOrange(i).getCost();
        }

        return total;
    }
}
