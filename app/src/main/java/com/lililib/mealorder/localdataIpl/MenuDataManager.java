package com.lililib.mealorder.localdataIpl;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.provider.BaseColumns;

import com.lililib.mealorder.localdata.BasicDataBank;

public class MenuDataManager extends BasicDataBank<MealItem> {

    public MenuDataManager(Context context){
        super(new MySQLiteOpenHelper(context));
    }

    @SuppressLint("Range")
    @Override
    public MealItem toData(Cursor cursor) {
        MealItem mealItem = new MealItem();
        mealItem.setSqlId(cursor.getInt(cursor.getColumnIndex(BaseColumns._ID)));
        mealItem.setPrice(cursor.getInt(cursor.getColumnIndex(MealItem.COLUMN_MEAL_PRICE)));
        mealItem.setName(cursor.getString(cursor.getColumnIndex(MealItem.COLUMN_MEAL_NAME)));
        return mealItem;
    }

    @Override
    public ContentValues toContentValues(MealItem data) {
        ContentValues cv = new ContentValues();
        cv.put(MealItem.COLUMN_MEAL_NAME, data.getName());
        cv.put(MealItem.COLUMN_MEAL_PRICE, data.getPrice());
        return cv;
    }
}
