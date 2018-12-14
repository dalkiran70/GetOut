package com.bilkent.subfly.getout;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.WindowManager;


import com.google.firebase.analytics.FirebaseAnalytics;

import Adapter.SectionStatePagerAdapter;

/**
 * @author : Muhammed Naci Dalkıran
 */

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main Activity";
    private ViewPager mViewPager;
    private SectionStatePagerAdapter mSectionStatePagerAdapter;
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started...");

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        mViewPager = (ViewPager) findViewById(R.id.container);
        mSectionStatePagerAdapter = new SectionStatePagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mSectionStatePagerAdapter);
        mViewPager.setCurrentItem(1);
    }

    public ViewPager getmViewPager(){
        return mViewPager;
    }
}
