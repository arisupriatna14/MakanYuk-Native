package com.arisupriatna.makanyuk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMeal;
    private ArrayList<Meal> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMeal = findViewById(R.id.rv_meal);
        rvMeal.setHasFixedSize(true);

        list.addAll(MealsData.getListData());
        showRecycleCardView();
    }

    private void showRecycleCardView() {
        rvMeal.setLayoutManager(new LinearLayoutManager(this));
        ListMealAdapter listMealAdapter = new ListMealAdapter(list);
        rvMeal.setAdapter(listMealAdapter);
    }
}
