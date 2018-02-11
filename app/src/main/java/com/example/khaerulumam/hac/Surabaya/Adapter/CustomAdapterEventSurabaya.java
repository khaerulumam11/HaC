package com.example.khaerulumam.hac.Surabaya.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.khaerulumam.hac.R;

/**
 * Created by Umam on 2/8/2018.
 */

public class CustomAdapterEventSurabaya extends BaseAdapter {

    Context context;
    String nama2[];
    int flags[];
    LayoutInflater inflter;

    public CustomAdapterEventSurabaya(Context applicationContext, String[] nama, int[] flags) {
        this.context = context;
        this.nama2 = nama;
        this.flags = flags;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return nama2.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_listview, null);
        TextView nama1 = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        nama1.setText(nama2[i]);
        icon.setImageResource(flags[i]);
        return view;
    }
}
