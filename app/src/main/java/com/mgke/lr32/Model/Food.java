package com.mgke.lr32.Model;

import com.mgke.lr32.R;

public class Food {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Food[] foods = {
            new Food("Сэндвич", "Сэндвич — это бутерброд с различными начинками, такими как мясо, сыр, овощи и соусы. Идеально подходит для быстрого перекуса или ланча.", R.drawable.sandwich),
            new Food("Салат", "Зеленый салат — это легкое и полезное блюдо, состоящее из свежих овощей и зелени. Его можно подавать с различными заправками, что делает его универсальным выбором для любого приема пищи.", R.drawable.salad),
            new Food("Суп", "Горячий суп с курицей — это классическое блюдо, которое согревает и насыщает. Включает кусочки курицы, овощи и пряности, создавая ароматное и вкусное блюдо.", R.drawable.soup)
    };

    private Food(String name, String description, int imageResourceId) {
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