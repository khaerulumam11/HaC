package com.example.khaerulumam.hac.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.khaerulumam.hac.DinamisFragment;

import java.util.List;

/**
 * Created by Umam on 2/8/2018.
 */

public class FragmentAdapter extends FragmentPagerAdapter {
    private Context ctx;

    private List<String> data;

    private Fragment[] fragments;



    public FragmentAdapter(Context ctx, FragmentManager fm, List<String> data) {

        super(fm);

        this.ctx = ctx;

        this.data = data;

        fragments = new Fragment[data.size()];

    }



    @Override

    public Fragment getItem(int position) {

        Fragment fragment = null;

        String items = data.get(position);





        DinamisFragment dinamisFragment = new DinamisFragment();

        dinamisFragment.setDetail(items);

        fragment = dinamisFragment;



        if (fragments[position] == null) {

            fragments[position] = fragment;

        }

        return fragments[position];

    }



    @Override

    public int getCount() {

        if (data != null) {

            return data.size();

        } else {

            return 0;

        }

    }
}
