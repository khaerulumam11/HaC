package com.example.khaerulumam.hac.Surabaya.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Umam on 2/8/2018.
 */

public class SectionTariRemo extends FragmentPagerAdapter {
    public SectionTariRemo(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                InfoTariRemo requestFragment = new InfoTariRemo();
                return requestFragment;

            case 1:
                MapRemo mapFragment = new MapRemo();
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
