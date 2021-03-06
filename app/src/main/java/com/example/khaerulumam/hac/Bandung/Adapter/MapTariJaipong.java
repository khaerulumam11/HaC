package com.example.khaerulumam.hac.Bandung.Adapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.khaerulumam.hac.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapBatikJalak extends Fragment implements OnMapReadyCallback {


    public MapBatikJalak() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_map, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        SupportMapFragment fragments = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        fragments.getMapAsync(this);

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {

        LatLng marker = new LatLng(-6.941296449999999,107.64109305);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(marker,13));
        googleMap.addMarker(new MarkerOptions().title("Toko Batik Jalak Harupat").position(marker));

    }
}

