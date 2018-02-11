package com.example.khaerulumam.hac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.khaerulumam.hac.Adapter.GridViewAdapter;

public class PilihDestinasi extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_destinasi);

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar_destninasi);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Pilihan Destinasi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        image = (ImageView) findViewById(R.id.imageView4);

        image.setImageResource(R.drawable.jakarta);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter (new GridViewAdapter(PilihDestinasi.this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i){
                    case 0:
                        Intent pindah = new Intent(PilihDestinasi.this, MainActivity.class);
                        startActivity(pindah);
                        //finish();
                        break;
                    case 1:
                        Intent pindah2 = new Intent(PilihDestinasi.this, MainActivity.class);
                        startActivity(pindah2);
                        //finish();
                        break;
                    case 2:
                        Intent pindah3 = new Intent(PilihDestinasi.this, MainActivity.class);
                        startActivity(pindah3);
                        //  finish();
                        break;
                    case 3:
                        Intent pindah4 = new Intent(PilihDestinasi.this, MainActivity.class);
                        startActivity(pindah4);
                        //  finish();
                        break;

                    case 4:
                        Intent pindah5 = new Intent(PilihDestinasi.this, MainActivity.class);
                        startActivity(pindah5);
                        //  finish();
                        break;


                }
            }
        });
    }
}
