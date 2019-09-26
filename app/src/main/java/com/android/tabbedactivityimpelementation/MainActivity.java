package com.android.tabbedactivityimpelementation;

import android.os.Bundle;

import com.android.tabbedactivityimpelementation.ui.main.Fragment1;
import com.android.tabbedactivityimpelementation.ui.main.Fragment2;
import com.android.tabbedactivityimpelementation.ui.main.Fragment4;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import com.android.tabbedactivityimpelementation.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        sectionsPagerAdapter.addFragment( new Fragment1(), "Frag 1");
        sectionsPagerAdapter.addFragment( new Fragment2(), "Frag 2");
        sectionsPagerAdapter.addFragment( new Fragment4(), "Frag 3");
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}