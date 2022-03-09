package com.lililib.mealorder.localdataIpl;

import com.lililib.mealorder.localdata.DbNameSpace;

public class MenuNameSpace extends DbNameSpace {

    public static final String TABLE_NAME_MENU = "menu_table";

    public MenuNameSpace(){
        super(TABLE_NAME_MENU);
    }

    @Override
    public String getCreateStr() {
        return startText() + MealItem.COLUMN_MEAL_NAME + TYPE_TEXT
                + MealItem.COLUMN_MEAL_PRICE + endText(TYPE_TEXT);
    }
}
