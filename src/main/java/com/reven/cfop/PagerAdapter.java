package com.reven.cfop;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PagerAdapter extends FragmentPagerAdapter
{
    private ArrayList<Fragment> fragments;

    public PagerAdapter(FragmentManager fm)
    {
        super(fm);
        fragments = new ArrayList<>(2);
    }

    @Override
    public Fragment getItem(int position)
    {
        return fragments.get(position);
    }

    @Override
    public int getCount()
    {
        return fragments.size();
    }

    public void add(Fragment fragment)
    {
        fragments.add(fragment);
    }
}
