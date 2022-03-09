package com.lililib.mealorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lililib.mealorder.localdataIpl.MenuDataManager;

public class MainActivity extends AppCompatActivity {

    private MenuDataManager menuDataManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menuDataManager = new MenuDataManager(getApplicationContext());
    }

    public MenuDataManager getMenuDataManager() {
        return menuDataManager;
    }

}