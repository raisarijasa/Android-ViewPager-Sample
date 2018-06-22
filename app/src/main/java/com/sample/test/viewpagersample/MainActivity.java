package com.sample.test.viewpagersample;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/**
 * Created by Rai_A on 6/21/2018.
 */
public class MainActivity extends AppCompatActivity {
    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tablayout);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPager.setOffscreenPageLimit(1);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setCurrentItem(0);
        tabLayout.setupWithViewPager(viewPager);
    }
}