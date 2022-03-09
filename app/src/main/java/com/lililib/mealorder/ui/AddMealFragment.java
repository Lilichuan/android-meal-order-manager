package com.lililib.mealorder.ui;

import android.icu.math.BigDecimal;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lililib.mealorder.R;
import com.lililib.mealorder.localdataIpl.MealItem;


public class AddMealFragment extends BaseFragment {

    private AppCompatEditText inputName,inputPrice;
    private View root;

    public AddMealFragment() {
        // Required empty public constructor
    }


    public static AddMealFragment newInstance() {
        AddMealFragment fragment = new AddMealFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_add_meal, container, false);
        inputName = root.findViewById(R.id.input_name_edittext);
        inputPrice = root.findViewById(R.id.input_price_edittext);
        root.findViewById(R.id.add_btn).setOnClickListener(view -> {
            add();
        });

        return root;
    }

    private void add(){
        String name = inputName.getText().toString();
        if(TextUtils.isEmpty(name)){
            showSnackBar(getView(), R.string.need_input_name);
            return;
        }

        String priceText = inputPrice.getText().toString();
        if(TextUtils.isEmpty(priceText)){
            showSnackBar(getView(), R.string.need_input_price);
            return;
        }
//BigDecimal
        BigDecimal price = new BigDecimal(priceText);
        if(price.floatValue() <= 0){
            showSnackBar(getView(), R.string.need_input_number);
            return;
        }

        MealItem item = new MealItem();
        item.setName(name);
        item.setPrice(price);
        //TODO change page
    }
}