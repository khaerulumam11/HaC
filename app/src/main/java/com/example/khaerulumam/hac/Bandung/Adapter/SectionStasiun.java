package com.example.khaerulumam.hac.Jakarta.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.khaerulumam.hac.Surabaya.Adapter.InfoJayamahe;
import com.example.khaerulumam.hac.Surabaya.Adapter.MapJayamahe;

/**
 * Created by Umam on 2/8/2018.
 */

public class SectionBahari extends FragmentPagerAdapter {
    public SectionBahari(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                InfoMuseumBahari requestFragment = new InfoMuseumBahari();
                return requestFragment;

            case 1:
                MapBahari mapFragment = new MapBahari();
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
