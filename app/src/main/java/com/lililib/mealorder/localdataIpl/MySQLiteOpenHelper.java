package com.lililib.mealorder.localdataIpl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.lililib.mealorder.localdata.DbNameSpace;

public class MySQLiteOpenHelper extends SQLiteOpenHelper {

    public MySQLiteOpenHelper(Context context){
        super(context, DbNameSpace.DB_NAME,null, DbNameSpace.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        MenuNameSpace menuNameSpace = new MenuNameSpace();
        sqLiteDatabase.execSQL(menuNameSpace.getCreateStr());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
