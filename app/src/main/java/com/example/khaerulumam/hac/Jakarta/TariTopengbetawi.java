package com.example.khaerulumam.hac.Jakarta;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.example.khaerulumam.hac.Jakarta.Adapter.SectionBatikOndel;
import com.example.khaerulumam.hac.Jakarta.Adapter.SectionMonas;
import com.example.khaerulumam.hac.R;

public class BatikOndel extends AppCompatActivity {

    private Toolbar mToolbar;
    private ViewPager mViewPager;
    private SectionBatikOndel mSectionsPagerAdapter;
    private TabLayout mTabLayout;
    private ImageView a ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        mToolbar = (Toolbar) findViewById(R.id.appbar_event);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Batik Ondel - Ondel");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        a = (ImageView) findViewById(R.id.gambar);

        a.setImageResource(R.drawable.batikondel);

        mViewPager = (ViewPager) findViewById(R.id.main_tabPager);

        mSectionsPagerAdapter = new SectionBatikOndel(getSupportFragmentManager());

        mViewPager.setAdapter(mSectionsPagerAdapter);

        mTabLayout = (TabLayout) findViewById(R.id.main_tabs);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
