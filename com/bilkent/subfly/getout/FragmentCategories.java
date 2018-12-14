package com.bilkent.subfly.getout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.Toast;

/**
 * @author :Ali Taha Dincer and Muhammed Naci Dalkıran
 *
 */

public class FragmentCategories extends Fragment {

    private static final String TAG = "Categories Created...";

    private ImageButton transportation;
    private ImageButton meal;
    private ImageButton sport;
    private ImageButton groupWork;
    private ImageButton game;
    private ImageButton allEvent;
    private SearchView searchBar;
    private Toolbar toolbar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout_categories,container,false);
        transportation = (ImageButton) view.findViewById(R.id.transportation);
        meal = (ImageButton) view.findViewById(R.id.meal);
        sport = (ImageButton) view.findViewById(R.id.sport);
        groupWork = (ImageButton) view.findViewById(R.id.groupWork);
        game = (ImageButton) view.findViewById(R.id.game);
        allEvent = (ImageButton) view.findViewById(R.id.allEvents);
        searchBar = (SearchView) view.findViewById(R.id.searchBar);
        toolbar = view.findViewById(R.id.toolbar);

        Log.d(TAG , "Categories Created...");

        searchBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchBar.setIconified(false);
            }
        });

        transportation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Transportation Clicked...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), EventViewerActivity.class);
                startActivity(intent);
            }
        });
        meal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Meal Clicked...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), EventViewerActivity.class);
                startActivity(intent);
            }
        });
        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Sport Clicked...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), EventViewerActivity.class);
                startActivity(intent);
            }
        });
        groupWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Group Work Clicked...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), EventViewerActivity.class);
                startActivity(intent);
            }
        });
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Game Clicked...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), EventViewerActivity.class);
                startActivity(intent);
            }
        });
        allEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "All Event Clicked...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), EventViewerActivity.class);
                startActivity(intent);
            }
        });


        return view;

    }

    public Fragment newInstance(){
        return this;
    }
}
