package com.example.khaerulumam.hac.Surabaya.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.khaerulumam.hac.InfoFragment;
import com.example.khaerulumam.hac.MapFragment;

/**
 * Created by Umam on 2/8/2018.
 */

public class SectionJayamahe extends FragmentPagerAdapter {
    public SectionJayamahe(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                InfoJayamahe requestFragment = new InfoJayamahe();
                return requestFragment;

            case 1:
                MapJayamahe mapFragment = new MapJayamahe();
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
