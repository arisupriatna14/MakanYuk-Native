package com.arisupriatna.makanyuk;

import java.util.ArrayList;

public class MealsData {
    public static String[][] data = new String[][] {
            {
                "Baked salmon with fennel & tomatoes", "https://www.themealdb.com/images/media/meals/1548772327.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
            },
            {
                "Cajun spiced fish tacos", "https://www.themealdb.com/images/media/meals/uvuyxu1503067369.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
            },
            {
                "Escovitch Fish", "https://www.themealdb.com/images/media/meals/1520084413.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
            },
            {
                "Fish pie", "https://www.themealdb.com/images/media/meals/ysxwuq1487323065.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
            },
            {
                "Fish Stew with Rouille", "https://www.themealdb.com/images/media/meals/vptqpw1511798500.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
            },
            {
                "Garides Saganaki", "https://www.themealdb.com/images/media/meals/wuvryu1468232995.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
            },
            {
                "Honey Teriyaki Salmon", "https://www.themealdb.com/images/media/meals/xxyupu1468262513.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
            },
            {
                "Kedgeree", "https://www.themealdb.com/images/media/meals/utxqpt1511639216.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
            },
            {
                "Kung Po Prawns", "https://www.themealdb.com/images/media/meals/1525873040.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
            },
            {
                "Laksa King Prawn Noodles", "https://www.themealdb.com/images/media/meals/rvypwy1503069308.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
            }
    };

    public static ArrayList<Meal> getListData() {
        ArrayList<Meal> list = new ArrayList<>();
        for (String[] aData: data) {
            Meal meal = new Meal();
            meal.setName(aData[0]);
            meal.setPhoto(aData[1]);
            meal.setDescription(aData[2]);

            list.add(meal);
        }

        return list;
    }
}
