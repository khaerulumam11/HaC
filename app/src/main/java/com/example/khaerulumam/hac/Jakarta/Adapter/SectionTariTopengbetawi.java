package com.example.khaerulumam.hac.Jakarta.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Umam on 2/8/2018.
 */

public class SectionBatikOndel extends FragmentPagerAdapter {
    public SectionBatikOndel(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                InfoBatikOndel requestFragment = new InfoBatikOndel();
                return requestFragment;

            case 1:
                MapBatikOndel mapFragment = new MapBatikOndel();
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
