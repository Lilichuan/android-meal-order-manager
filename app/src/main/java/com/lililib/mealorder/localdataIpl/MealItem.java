package com.lililib.mealorder.localdataIpl;

import android.text.TextUtils;

public class MealItem {

    public static final String COLUMN_MEAL_NAME = "name";
    public static final String COLUMN_MEAL_PRICE = "price";

    public int sqlId;
    public String name;
    public int price;

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setSqlId(int sqlId) {
        this.sqlId = sqlId;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSqlId() {
        return sqlId;
    }

    public boolean dataIsOk(){
        return price > 0 && !TextUtils.isEmpty(name);
    }
}
