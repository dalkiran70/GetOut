package com.bilkent.subfly.getout;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import Adapter.SeeEventsAdapter;
import Model.Event;
import Model.EventList;
import Model.SportEvent;

/**
 * @author :Ali Taha Dincer
 */

public class FragmentMain extends Fragment {

    private static final String TAG = "Fragment Main";

    private ImageView highlight;
    private RecyclerView recyclerView;
    private Button create;
    private Button profile;
    private Button categories;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout_main, container, false);
        highlight = (ImageView) view.findViewById(R.id.highlight);

        recyclerView = (RecyclerView) view.findViewById(R.id.closeToFull);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        create = (Button) view.findViewById(R.id.createMain);
        profile = (Button) view.findViewById(R.id.profile);
        categories = (Button) view.findViewById(R.id.categories);
        Log.d(TAG, "mCreateView Created...");

        EventList eventsList = new EventList();
        for ( int i = 0; i < 10; i++) {
            Event event = new SportEvent("Meeting in Mayfest Grasses", "Mayfest","11/11/2011", "14:00", 5, "Bring your flamethrover!");
            eventsList.add(event);
        }

        SeeEventsAdapter adapter1 = new SeeEventsAdapter((MainActivity)getActivity(),eventsList);
        recyclerView.setAdapter(adapter1);

        highlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Highlight's clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), DetailsActivity.class);
                startActivity(intent);
            }
        });

        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Recycler Clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), DetailsActivity.class);
                startActivity(intent);
            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).getmViewPager().setCurrentItem(0);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ProfileController.class);
                startActivity(intent);
            }
        });

        categories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).getmViewPager().setCurrentItem(2);
            }
        });

        return view;
    }

    public Fragment newIntance(){
        return this;
    }
}
