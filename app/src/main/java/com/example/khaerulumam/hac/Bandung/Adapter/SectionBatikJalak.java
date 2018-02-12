package com.example.khaerulumam.hac.Bandung.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.khaerulumam.hac.Jakarta.Adapter.InfoMuseumBahari;
import com.example.khaerulumam.hac.Jakarta.Adapter.MapBahari;

/**
 * Created by Umam on 2/8/2018.
 */

public class SectionBoscha extends FragmentPagerAdapter {
    public SectionBoscha(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                InfoBoscha requestFragment = new InfoBoscha();
                return requestFragment;

            case 1:
                MapBoscha mapFragment = new MapBoscha();
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
