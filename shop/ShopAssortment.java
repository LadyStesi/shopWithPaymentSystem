package main.java.com.akhmialkova.homework19.shop;

import java.util.LinkedHashSet;
import java.util.Objects;

public class ShopAssortment {
    LinkedHashSet<Product> assortment;

    public ShopAssortment(LinkedHashSet<Product> assortment) {
        this.assortment = assortment;
    }

    @Override
    public String toString() {
        return "ShopAssortment{" +
                "assortment=" + assortment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopAssortment that = (ShopAssortment) o;
        return Objects.equals(assortment, that.assortment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assortment);
    }
}
