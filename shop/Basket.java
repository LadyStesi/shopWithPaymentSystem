package main.java.com.akhmialkova.homework19.shop;

import main.java.com.akhmialkova.homework19.paymentSystem.Card;
import main.java.com.akhmialkova.homework19.paymentSystem.EcseptionWrongAmount;

import java.util.LinkedHashMap;

public class Basket {
    protected LinkedHashMap<String,Integer> basket;
    private int sum;

    public Basket() {
        this.basket = new LinkedHashMap<>();
    }

    public LinkedHashMap<String,Integer> getBasket() {
        return basket;
    }

    public int getSum() {
        return sum;
    }

    public void addProductIntoBasket(String productName, Integer requiredQuantity, Integer productPrice) {
        basket.put(productName,requiredQuantity);
        sum+= requiredQuantity*productPrice;

    }

    public void buyProductsFromBasket(int sum, Card fromCard, Card toCard) throws EcseptionWrongAmount {
        fromCard.transferFromCardToCard(sum, fromCard, toCard);
        cleanBasket();
    }


    private void cleanBasket() {
        basket.clear();
    }

    public String printCheck(){
       return toString();
    }



    @Override
    public String toString() {
        return "Basket{" +
                "basket=" + basket +
                ", sum=" + sum +
                '}';
    }
}
