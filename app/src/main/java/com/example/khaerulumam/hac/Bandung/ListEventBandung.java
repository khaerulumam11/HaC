package com.example.khaerulumam.hac.Bandung;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.khaerulumam.hac.Bandung.Adapter.CustomAdapterEventBandung;
import com.example.khaerulumam.hac.Jakarta.Adapter.CustomAdapterBudaya;
import com.example.khaerulumam.hac.PilihDestinasi;
import com.example.khaerulumam.hac.PilihDestinasiBandung;
import com.example.khaerulumam.hac.PilihDestinasiSurabaya;
import com.example.khaerulumam.hac.R;

public class ListEventBandung extends AppCompatActivity {

    ListView simpleList;
    String nama[] = {"Jakarta", "Bandung", "Surabaya"};
    int flags[] = {R.drawable.jakarta,R.drawable.bandung,R.drawable.surabaya};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_event);
        simpleList = (ListView) findViewById(R.id.listview);
        CustomAdapterEventBandung customAdapter = new CustomAdapterEventBandung(getApplicationContext(),nama,flags);
        simpleList.setAdapter(customAdapter);

        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent a = new Intent(ListEventBandung.this,PilihDestinasi.class);
                        startActivity(a);
                        break;
                    case 1:
                        Intent b = new Intent(ListEventBandung.this,PilihDestinasiBandung.class);
                        startActivity(b);
                        break;
                    case 2:
                        Intent c = new Intent(ListEventBandung.this,PilihDestinasiSurabaya.class);
                        startActivity(c);
                        break;
                }
            }
        });

    }
}
