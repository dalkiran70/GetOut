package com.bilkent.subfly.getout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import Adapter.CurrentParticipantsAdapter;
import Model.User;
import Model.UserList;

/**
 * @author : Caglar Cankaya
 */

public class DetailsActivity extends AppCompatActivity {

    private TextView title;
    private TextView hour;
    private TextView date;
    private TextView description;
    private TextView location;
    private TextView participants;

    private Bundle extras;
    private RecyclerView recyclerView2;
    private CurrentParticipantsAdapter adapter2;
    private UserList userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        extras = getIntent().getExtras();

        title = findViewById(R.id.dTitle);
        hour = findViewById(R.id.dHour);
        date = findViewById(R.id.dDate);
        description = findViewById(R.id.dDescription);
        location = findViewById(R.id.dLocation);
        participants = findViewById(R.id.currentNumber);

        if (extras != null){
            title.setText(extras.getString("title"));
            hour.setText(extras.getString("hour"));
            date.setText(extras.getString("date"));
            description.setText(extras.getString("description"));
            location.setText(extras.getString("location"));
            participants.setText(extras.getString("personNumber"));
        }
        userList = new UserList();
        for ( int j = 0; j < 10; j++ ){
            User user = new User("mehmet.kamıs@ug.bilkent.edu.tr");
            userList.add(user);
        }

        recyclerView2 = findViewById(R.id.participantRecycler);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        adapter2 = new CurrentParticipantsAdapter(this, userList);
        recyclerView2.setAdapter(adapter2);

    }
}
