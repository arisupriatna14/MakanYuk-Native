package com.arisupriatna.makanyuk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MealDetail extends AppCompatActivity {
    public static final String MEAL_NAME = "meal_name";
    public static final String MEAL_PHOTO = "meal_photo";
    public static final String MEAL_DESCRIPTION = "meal_description";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_detail);

        TextView tvMealName = findViewById(R.id.tv_item_name_detail);
        TextView tvMealDesc = findViewById(R.id.tv_item_description_detail);
        ImageView imgMeal = findViewById(R.id.img_item_meal_detail);

        Bundle bundle = getIntent().getExtras();
        String mealName = getIntent().getStringExtra(MEAL_NAME);
        String descriptionMeal = getIntent().getStringExtra(MEAL_DESCRIPTION);
        String imgMealUrl = bundle.getString(MEAL_PHOTO);

        tvMealName.setText(mealName);
        tvMealDesc.setText(descriptionMeal);
        Glide.with(this).load(imgMealUrl).into(imgMeal);
    }
}
