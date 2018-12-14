package com.bilkent.subfly.getout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
/**
 * @author : Tolga Çatalpinar
 */
public class ProfileController extends AppCompatActivity {

    private static final String TAG = "ProfileController";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_layout);
        Log.d(TAG," Profile Controller Started...");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}
