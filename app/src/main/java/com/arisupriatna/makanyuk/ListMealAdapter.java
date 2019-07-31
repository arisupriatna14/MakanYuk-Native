package com.arisupriatna.makanyuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMealAdapter extends RecyclerView.Adapter<ListMealAdapter.ListViewHolder> {
    private ArrayList<Meal> listMeal;

    public ListMealAdapter(ArrayList<Meal> list) {
        this.listMeal = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_meal, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int i) {
        final Meal meal = listMeal.get(i);

        Glide.with(holder.itemView.getContext())
                .load(meal.getPhoto())
                .apply(new RequestOptions().override(350, 350))
                .into(holder.imgPhoto);

        holder.tvName.setText(meal.getName());
        holder.tvDescription.setText(meal.getDescription());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString(MealDetail.MEAL_PHOTO, meal.getPhoto());
                Intent moveWithDataIntent = new Intent(v.getContext(), MealDetail.class);
                moveWithDataIntent.putExtra(MealDetail.MEAL_NAME, meal.getName());
                moveWithDataIntent.putExtras(bundle);
                moveWithDataIntent.putExtra(MealDetail.MEAL_DESCRIPTION, meal.getDescription());
                v.getContext().startActivity(moveWithDataIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listMeal.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDescription;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_meal);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDescription = itemView.findViewById(R.id.tv_item_desc_short);
        }
    }
}
