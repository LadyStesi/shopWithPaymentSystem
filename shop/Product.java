package main.java.com.akhmialkova.homework19.shop;

import java.util.Objects;

public class Product {
    private String name;
    private int price;
    private int quantity;
    private int rating;
    Category category;

    public Product(String name, int price, int quantity, Category category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public int getQuantity() {
        return quantity;
    }

    private int countQuantity(int numberOfPurchases) {
        quantity = quantity - numberOfPurchases;
        return quantity;
    }

    private int countRating(int numberOfPurchases) {
        rating = rating + numberOfPurchases;
        return rating;
    }

    public void recount(int boughtQuantity) {
        countQuantity(boughtQuantity);
        countRating(boughtQuantity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price &&
                rating == product.rating &&
                quantity == product.quantity &&
                name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, rating, quantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", rating=" + rating +
                ", category=" + category +
                '}';
    }
}
