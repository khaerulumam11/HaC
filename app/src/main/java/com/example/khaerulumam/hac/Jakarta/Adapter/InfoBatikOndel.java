package com.example.khaerulumam.hac.Jakarta.Adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.khaerulumam.hac.R;


public class InfoLubangBuaya extends Fragment {

    private TextView a,b,c,d,e;

    public InfoLubangBuaya() {
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

        a.setText("Monumen Pahlawan Revolusi");
        b.setText("Alamat: Jl. Raya Pd. Gede, RT.1/RW.2, Lubang Buaya, Cipayung, Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta 13810");
        c.setText("Jam : 08.00 - 18.00 WIB");
        d.setText("Tahun Berdiri : 1967");
        e.setText(R.string.sejarah_lubang);

        return view;
    }


}
