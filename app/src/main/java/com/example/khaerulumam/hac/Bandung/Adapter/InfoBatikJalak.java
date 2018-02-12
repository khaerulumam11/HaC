package com.example.khaerulumam.hac.Bandung.Adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.khaerulumam.hac.R;


public class InfoBoscha extends Fragment {

    private TextView a,b,c,d,e;

    public InfoBoscha() {
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
        b.setText("Alamat: Ujung, Semampir, Kota Surabaya, Jawa Timur 60155");
        c.setText("Jam : 08.00 - 17.00 WIB");
        d.setText("Tahun Berdiri : 1993");
        e.setText(R.string.sejarah_jayamahe);

        return view;
    }


}
