package main.java.com.akhmialkova.homework19.shop;

import main.java.com.akhmialkova.homework19.paymentSystem.DebitCard;
import main.java.com.akhmialkova.homework19.paymentSystem.EcseptionWrongAmount;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) throws EcseptionWrongAmount {
        Product польто = new Product("Польто", 1500, 2, Category.OUTERWEAR);
        Product куртка = new Product("Куртка", 1200, 5, Category.OUTERWEAR);
        Product плащ = new Product("Плащ", 1400, 4, Category.OUTERWEAR);
        Product брюки = new Product("Брюки", 900, 3, Category.CLOTHES);
        Product рубашка = new Product("Рубашка", 600, 7, Category.CLOTHES);
        Product платье = new Product("Платье", 1200, 4, Category.CLOTHES);
        Product юбка = new Product("Юбка", 700, 3, Category.CLOTHES);
        Product туфли = new Product("Туфли", 600, 7, Category.FOOTWEAR);
        Product шлепки = new Product("Шлепки", 600, 7, Category.FOOTWEAR);
        Product босоножки = new Product("Босоножки", 600, 7, Category.FOOTWEAR);

        LinkedHashSet<Product> ассортимент = new LinkedHashSet();
        ассортимент.add(польто);
        ассортимент.add(плащ);
        ассортимент.add(куртка);
        ассортимент.add(брюки);
        ассортимент.add(рубашка);
        ассортимент.add(платье);
        ассортимент.add(юбка);
        ассортимент.add(туфли);
        ассортимент.add(шлепки);
        ассортимент.add(босоножки);
        ShopAssortment assortment = new ShopAssortment(ассортимент);
        System.out.println(assortment.toString());

        DebitCard shopCard = new DebitCard("Shop",0);
        User user1 = new User("Tom Bin","124578");
        DebitCard user1Card = new DebitCard("Tom Bin",2600);
        Basket user1Basket = new Basket();

        user1Basket.addProductIntoBasket(босоножки.getName(),1,босоножки.getPrice());
        user1Basket.addProductIntoBasket(брюки.getName(),2,брюки.getPrice());
        System.out.println(user1Basket.printCheck());
        System.out.println(user1Card.getBalance());
        System.out.println(shopCard.getBalance());
        user1Basket.buyProductsFromBasket(user1Basket.getSum(),user1Card,shopCard);
        System.out.println(user1Card.getBalance());
        System.out.println(shopCard.getBalance());


        босоножки.recount(1);
        брюки.recount(2);
        System.out.println(assortment.toString());
    }
}




