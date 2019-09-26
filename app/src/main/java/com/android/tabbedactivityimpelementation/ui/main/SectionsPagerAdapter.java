package com.android.tabbedactivityimpelementation.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.android.tabbedactivityimpelementation.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private final List<String> fragmentTitles =  new ArrayList<>();
    private final List<Fragment> fragmentList = new ArrayList<>();

    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a Fragment1 (defined as a static inner class below).
        return fragmentList.get(position);
    }

    public void addFragment (Fragment fragment, String string) {
        fragmentList.add(fragment);
        fragmentTitles.add(string);

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitles.get(position);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return fragmentList.size();
    }
}