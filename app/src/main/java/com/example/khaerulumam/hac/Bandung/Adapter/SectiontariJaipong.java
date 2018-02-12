package com.example.khaerulumam.hac.Bandung.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Umam on 2/8/2018.
 */

public class SectionBatikJalak extends FragmentPagerAdapter {
    public SectionBatikJalak(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                InfoBatikJalak requestFragment = new InfoBatikJalak();
                return requestFragment;

            case 1:
                MapBatikJalak mapFragment = new MapBatikJalak();
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
