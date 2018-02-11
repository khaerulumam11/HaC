package com.example.khaerulumam.hac.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.khaerulumam.hac.InfoFragment;
import com.example.khaerulumam.hac.MapFragment;

/**
 * Created by Umam on 2/8/2018.
 */

public class SectionPagerAdapter extends FragmentPagerAdapter {
    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                InfoFragment requestFragment = new InfoFragment();
                return requestFragment;

            case 1:
                MapFragment mapFragment = new MapFragment();
                return mapFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position){

        switch (position){
            case 0:
                return "INFO";
            case 1:
                return "MAPS";
            default:
                return null;
        }
    }
}
