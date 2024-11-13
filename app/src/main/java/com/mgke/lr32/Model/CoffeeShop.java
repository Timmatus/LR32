package com.mgke.lr32.Model;
import com.mgke.lr32.R;

public class CoffeeShop {
    private String name;
    private String description;
    private int imageResourceId;

    public static final CoffeeShop[] coffeeShops = {
            new CoffeeShop("Starbucks", "Популярная международная кофейня, известная своим большим ассортиментом кофе и фирменных напитков. Starbucks предлагает удобные и уютные места для отдыха или работы с чашечкой любимого кофе.", R.drawable.starbucks),
            new CoffeeShop("CoffeeBean", "Местная кофейня с уютной атмосферой, предлагающая уникальные сорта кофе и свежую выпечку. CoffeeBean идеально подходит для тех, кто ищет расслабляющее место с качественным кофе.", R.drawable.coffeebean),
            new CoffeeShop("Costa", "Кофейня с широким выбором напитков, включая различные виды кофе, чая и десертов. Costa славится своим уютом и высоким качеством обслуживания.", R.drawable.costa)
    };

    private CoffeeShop(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
    public String toString() {
        return this.name;
    }
}