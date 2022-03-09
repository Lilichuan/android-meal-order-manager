package com.lililib.mealorder.ui;

import android.view.View;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;
import com.lililib.mealorder.MainActivity;
import com.lililib.mealorder.localdataIpl.MenuDataManager;

public class BaseFragment extends Fragment {


    protected MenuDataManager getMenuDataManager(){
        MainActivity ac = (MainActivity) getActivity();
        return ac.getMenuDataManager();
    }

    protected void showSnackBar(View view, @StringRes int str){
        Snackbar.make(view, str, Snackbar.LENGTH_LONG).show();
    }
}
