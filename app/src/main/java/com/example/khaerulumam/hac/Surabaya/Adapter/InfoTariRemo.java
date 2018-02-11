package com.example.khaerulumam.hac.Surabaya.Adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.khaerulumam.hac.R;


public class InfoTariRemo extends Fragment {

    private TextView a,b,c,d,e;

    public InfoTariRemo() {
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

        a.setText("Tari Remo");
        b.setText("Tempat untuk menyaksikan Tari Remo : Taman Budaya Jawa Timur");
        c.setText("Jam : 17.00 - 21.00");
        d.setText("Tema Tari Remo adalah Kepahlawanan");
        e.setText(R.string.sejarah_tariremo);

        return view;
    }


}
