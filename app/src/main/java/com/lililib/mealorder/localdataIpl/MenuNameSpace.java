package com.lililib.mealorder.localdataIpl;

import com.lililib.mealorder.localdata.DbNameSpace;

public class MenuNameSpace extends DbNameSpace {

    public static final String TABLE_NAME_MENU = "menu_table";

    public static final String COLUMN_MEAL_NAME = "name";
    public static final String COLUMN_MEAL_PRICE = "price";

    public MenuNameSpace(){
        super(TABLE_NAME_MENU);
    }

    @Override
    protected String getCreateStr() {
        return startText() + COLUMN_MEAL_NAME + TYPE_TEXT
                + COLUMN_MEAL_PRICE + endText(TYPE_MONEY);
    }
}
