package com.example.khaerulumam.hac.Surabaya.Adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.khaerulumam.hac.R;


public class InfoLudruk extends Fragment {

    private TextView a,b,c,d,e;

    public InfoLudruk() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        a = (TextView) view.findViewById(R.id.nama);
        b = (TextView) view.findViewById(R.id.alamat);
        c = (TextView) view.findViewById(R.id.jam);
        d = (TextView) view.findViewById(R.id.kapan);
        e = (TextView) view.findViewById(R.id.deskripsi);

        a.setText("Kesenian Ludruk");
        b.setText("Sejak : 1942");
        c.setText("Tempat Melihat atau Belajar Ludruk : THR Surabaya");
        d.setText("Jam : 08.00 - 15.00 WIB");
        e.setText(R.string.sejarah_ludruk);

        return view;
    }


}
