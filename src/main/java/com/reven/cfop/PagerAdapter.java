package com.reven.cfop;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> mFragments;
    private List<String> mTabTitles;

    public PagerAdapter(FragmentManager fm, List<String> tabTitles) {
        super(fm);
        mFragments = new ArrayList<>(3);
        mTabTitles = tabTitles;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    public void add(Fragment fragment) {
        mFragments.add(fragment);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitles.get(position);
    }
}
