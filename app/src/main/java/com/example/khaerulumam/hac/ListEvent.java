package com.example.khaerulumam.hac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.khaerulumam.hac.Adapter.CustomAdapter;

public class ListEvent extends AppCompatActivity {

    ListView simpleList;
    String nama[] = {"Indomaret Kedasih", "Indomaret Puspa", "Alfamart Puspa Raya", "Alfamart Kedasih Raya", "Alfamidi Beruang"};
    String harga[] = {"Rp.3000", "Rp.3000", "Rp.3000", "Rp.3000", "Rp.3000"};
    int flags[] = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_event);
        simpleList = (ListView) findViewById(R.id.listview);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),nama,harga,flags);
        simpleList.setAdapter(customAdapter);

        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent a = new Intent(ListEvent.this,MainActivity.class);
                        startActivity(a);
                        break;
                    case 1:
                        Intent b = new Intent(ListEvent.this,MainActivity.class);
                        startActivity(b);
                        break;
                    case 2:
                        Intent c = new Intent(ListEvent.this,MainActivity.class);
                        startActivity(c);
                        break;
                    case 3:
                        Intent d = new Intent(ListEvent.this,MainActivity.class);
                        startActivity(d);
                        break;
                    case 4:
                        Intent e = new Intent(ListEvent.this,MainActivity.class);
                        startActivity(e);
                        break;
                }
            }
        });

    }
}
