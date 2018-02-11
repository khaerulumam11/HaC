package com.example.khaerulumam.hac.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.khaerulumam.hac.R;

/**
 * Created by Umam on 2/7/2018.
 */

public class GridViewAdapter extends BaseAdapter {

    private final Context mContext;

    public GridViewAdapter(Context context) {
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
            R.drawable.sejarahjakarta, R.drawable.budayajakarta,
            R.drawable.storejakarta,R.drawable.eventjakarta

    };
}
