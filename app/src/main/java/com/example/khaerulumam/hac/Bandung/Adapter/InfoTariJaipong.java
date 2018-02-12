package com.example.khaerulumam.hac.Bandung.Adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.khaerulumam.hac.R;


public class InfoBatikJalak extends Fragment {

    private TextView a,b,c,d,e;

    public InfoBatikJalak() {
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

        a.setText("Batik Jalak Harupat");
        b.setText("Alamat:  Jl. Laswi No.1-H, Kacapiring, Batununggal, Kota Bandung, Jawa Barat 40271");
        c.setText("Jam : 08.00 - 17.00 WIB");
        d.setText("Tahun Berdiri : 1993");
        e.setText("Jalak Harupat adalah sebutan untuk sejenis ayam jantan dalam Bahasa Sunda. Stadion Si Jalak Harupat nama stadion di Soreang, Bandung, Jawa Barat . Batik Bandung - Bandung adalah salah satu kota periangan yang khas daerahnya. motif batik Kabupaten Bandung mempunyai kaitan yang erat satu tempat olehraga yang populer, tepanya stadion Jalak Harupat yang . Kursi kerja ini memiliki motif batik Kujang Kijang yang berasal dari Kota Batik yang berasal dari kota Bandung ini bernama Jalak Harupat.");

        return view;
    }


}
