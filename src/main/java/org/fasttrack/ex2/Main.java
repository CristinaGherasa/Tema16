package org.fasttrack.ex2;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Shop<Clothes> clothesShop = new Shop<>();
        clothesShop.addItem(new Clothes("Shirt", 30, Category.ON_SALE));
        clothesShop.addItem(new Clothes("Jeans", 50, Category.NEW));

        List<Clothes> clothesOnSale = clothesShop.findByCategory(Category.ON_SALE);
        System.out.println("Clothes on sale: " + clothesOnSale.size());

        Optional<Clothes> jeans = clothesShop.findByName("Jeans");
        jeans.ifPresent(item -> System.out.println("Found jeans: " + item.name()));

        clothesShop.removeItem("Shirt");

    }
}
