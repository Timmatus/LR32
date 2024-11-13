package com.mgke.lr32;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mgke.lr32.Model.Food;

public class FoodActivity extends AppCompatActivity {
    public static final String EXTRA_FOODID = "foodId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        int foodId = (Integer) getIntent().getExtras().get(EXTRA_FOODID);
        Food food = Food.foods[foodId];

        TextView name = findViewById(R.id.name);
        name.setText(food.getName());

        TextView description = findViewById(R.id.description);
        description.setText(food.getDescription());

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(food.getImageResourceId());
        photo.setContentDescription(food.getName());
    }
}