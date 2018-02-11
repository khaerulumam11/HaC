package com.example.khaerulumam.hac.Surabaya.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Umam on 2/8/2018.
 */

public class SectionLudruk extends FragmentPagerAdapter {
    public SectionLudruk(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                InfoLudruk requestFragment = new InfoLudruk();
                return requestFragment;

            case 1:
                MapLudruk mapFragment = new MapLudruk();
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
