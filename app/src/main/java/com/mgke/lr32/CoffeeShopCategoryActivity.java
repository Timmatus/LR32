package com.mgke.lr32;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.mgke.lr32.Model.CoffeeShop;

public class CoffeeShopCategoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_shop_category);

        ArrayAdapter<CoffeeShop> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                CoffeeShop.coffeeShops
        );

        ListView listCoffeeShops = findViewById(R.id.list_coffee_shops);
        listCoffeeShops.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listCoffeeShops, View itemView, int position, long id) {
                Intent intent = new Intent(CoffeeShopCategoryActivity.this, CoffeeShopActivity.class);
                intent.putExtra(CoffeeShopActivity.EXTRA_COFFEESHOPID, (int) id);
                startActivity(intent);
            }
        };
        listCoffeeShops.setOnItemClickListener(itemClickListener);
    }
}