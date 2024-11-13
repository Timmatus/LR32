package com.mgke.lr32.Model;

import com.mgke.lr32.R;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("Латте", "Латте — это кофейный напиток на основе эспрессо с большим количеством вспененного молока. Латте имеет мягкий вкус и идеально подходит для тех, кто предпочитает кофе с молоком.", R.drawable.latte),
            new Drink("Капучино", "Капучино — это классический итальянский напиток, приготовленный на основе эспрессо с равными частями молока и молочной пены. Этот напиток популярен благодаря своему насыщенному вкусу и кремовой текстуре.", R.drawable.cappuccino),
            new Drink("Раф", "Раф — это уникальный кофейный напиток, изобретенный в России. Он готовится путем смешивания эспрессо, сливок и сахара, что придает ему нежный и сладкий вкус.", R.drawable.raf)
    };

    private Drink(String name, String description, int imageResourceId) {
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