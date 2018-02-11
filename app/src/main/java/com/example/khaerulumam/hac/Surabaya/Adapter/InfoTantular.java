package com.example.khaerulumam.hac.Surabaya.Adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.khaerulumam.hac.R;


public class InfoTantular extends Fragment {

    private TextView a,b,c,d,e;

    public InfoTantular() {
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

        a.setText("Museum Jayamahe");
        b.setText("Alamat: Jl. Raya Buduran - Jembatan Layang, Jl. Raden Moh. Mangundipi, Siwalanpanji, Kec. Sidoarjo, Kabupaten Sidoarjo, Jawa Timur 61252");
        c.setText("Jam : 08.00 - 17.00 WIB");
        d.setText("Tahun Berdiri : 1933");
        e.setText(R.string.sejarah_tantular);

        return view;
    }


}
