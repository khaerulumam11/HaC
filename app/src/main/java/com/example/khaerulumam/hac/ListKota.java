package com.example.khaerulumam.hac;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.khaerulumam.hac.Adapter.CustomAdapter;
import com.example.khaerulumam.hac.Adapter.CustomAdapterKota;

public class ListKota extends AppCompatActivity {

    ListView simpleList;
    String nama[] = {"Jakarta", "Bandung", "Surabaya"};
    int flags[] = {R.drawable.jakarta,R.drawable.bandung,R.drawable.surabaya};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_event);
        simpleList = (ListView) findViewById(R.id.listview);
        CustomAdapterKota customAdapter = new CustomAdapterKota(getApplicationContext(),nama,flags);
        simpleList.setAdapter(customAdapter);

        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent a = new Intent(ListKota.this,PilihDestinasi.class);
                        startActivity(a);
                        break;
                    case 1:
                        Intent b = new Intent(ListKota.this,PilihDestinasiBandung.class);
                        startActivity(b);
                        break;
                    case 2:
                        Intent c = new Intent(ListKota.this,PilihDestinasiSurabaya.class);
                        startActivity(c);
                        break;
                }
            }
        });

    }
}
