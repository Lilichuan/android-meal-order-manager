package com.lililib.mealorder.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lililib.mealorder.R;
import com.lililib.mealorder.localdataIpl.MealItem;
import com.lililib.mealorder.localdataIpl.MenuDataManager;

import java.util.List;

/**
 * A fragment representing a list of Items.
 */
public class MealListFragment extends BaseFragment {

    private static final String ARG_COLUMN_COUNT = "column-count";

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public MealListFragment() {
    }

    public static MealListFragment newInstance() {
        MealListFragment fragment = new MealListFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, 1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            //mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_meal_list_list, container, false);


        view.findViewById(R.id.add_new_one).setOnClickListener(view1 -> {
            //TODO change to add new data fragment
        });

        RecyclerView recyclerView = view.findViewById(R.id.list);
        AppCompatTextView textView = view.findViewById(R.id.no_data_textview);
        Context context = view.getContext();

        List<MealItem> allData = getMenuDataManager().getAllMeal();
        if(allData.isEmpty()){
            //TODO Display empty page
            recyclerView.setVisibility(View.INVISIBLE);
            textView.setVisibility(View.VISIBLE);
        }else {
            recyclerView.setVisibility(View.VISIBLE);
            textView.setVisibility(View.INVISIBLE);
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new MyItemRecyclerViewAdapter(allData));

        return view;
    }
}