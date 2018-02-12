package com.example.khaerulumam.hac.Jakarta.Adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.khaerulumam.hac.R;


public class InfoBatikOndel extends Fragment {

    private TextView a,b,c,d,e;

    public InfoBatikOndel() {
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

        a.setText("Batik Ondel - Ondel");
        b.setText("Alamat Untuk Membeli: Jl.Terogong III No.27C, RT.9/RW.10, Cilandak Bar., Cilandak, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12430");
        c.setText("Jam : 09.00 - 17.00 WIB");
        d.setText("Telepon : (021) 7664672");
        e.setText("Batik Betawi motif ondel-ondel misalnya, mengangkat figur ondel-ondel yang konon digunakan untuk menolak bala. Diharapkan dengan memakainya, si pemakai akan terhindar dari bala. Sedangkan motif nusa kelapa diinspirasikan dari peta Ceila buatan Pangeran Panembong pada masa Prabu Siliwangi (1482-1521) yang menyebutkan bahwa Jakarta dulunya dinamai Nusa Kelapa oleh para leluhur Betawi. Sementara batik motif ciliwung berasal dari kehidupan masyarakat di tepian Sungai Ciliwung, dimana para penjajah Portugis dan Belanda begitu tertarik dengan sungai ini dan bermaksud menguasainya. Sesuai sejarahnya, orang yang memakai batik motif ciliwung ini diharapkan dapat menjadi pusat daya tarik dan sebagai simbol rejeki yang terus mengalir bak aliran sungai.");

        return view;
    }


}
