package com.bilkent.subfly.getout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import Adapter.SeeEventsAdapter;
import Model.Event;
import Model.EventList;
import Model.SportEvent;

/**
 * @author Caglar Cankaya
 *
 */

public class EventViewerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SeeEventsAdapter adapter1;
    private EventList eventsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_list_view);

        recyclerView = findViewById(R.id.recyclerViewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        eventsList = new EventList();
        for ( int i = 0; i < 10; i++) {
            Event event = new SportEvent("Meeting in Mayfest Grasses", "Mayfest","11/11/2011", "14:00", 5, "Bring your flamethrover!");
            eventsList.add(event);
        }
        adapter1 = new SeeEventsAdapter(this,eventsList);
        recyclerView.setAdapter(adapter1);
    }
}
