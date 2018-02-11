package com.example.khaerulumam.hac.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.khaerulumam.hac.R;

/**
 * Created by Umam on 2/7/2018.
 */

public class GridViewAdapterSurabaya extends BaseAdapter {

    private final Context mContext;

    public GridViewAdapterSurabaya(Context context) {
        this.mContext = context;
    }


    @Override
    public int getCount() {
        return mThumbIds.length;
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
        ImageView imageView;
        if (view==null){

            imageView = new ImageView(mContext);

            imageView.setLayoutParams(new GridView.LayoutParams(300,300));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setPadding(0,0,0,0);
        }
        else{
            imageView = (ImageView) view;
        }

        imageView.setImageResource(mThumbIds[i]);

        return imageView;
    }

    private Integer[] mThumbIds = {
            R.drawable.sejarahsurabaya, R.drawable.budayasurabaya,
            R.drawable.storesurabaya,R.drawable.eventsurabaya

    };
}
