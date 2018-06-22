package com.sample.test.viewpagersample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rai_A on 6/21/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    static final int NUM_ITEMS = 5;
    private List<Fragment> tabs = new ArrayList<>();

    private final List<String> tabTitles = new ArrayList<String>() {{
        add("Fragment 1");
        add("Fragment 2");
        add("Fragment 3");
        add("Fragment 4");
        add("Fragment 5");
    }};

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        initializeTabs();
    }

    private void initializeTabs() {
        tabs.add(new Fragment1());
        tabs.add(new Fragment2());
        tabs.add(new Fragment3());
        tabs.add(new Fragment4());
        tabs.add(new Fragment5());
    }

    @Override
    public Fragment getItem(int position) {
        Log.d("ViewPagerAdapter : ", "pos: " + position);
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles.get(position);
    }
}