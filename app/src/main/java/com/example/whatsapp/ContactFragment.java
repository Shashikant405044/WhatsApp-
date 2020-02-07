package com.example.whatsapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.Calendar;


public class ContactFragment extends Fragment {


    RecyclerView recyclerView;
    RecyclerView recyclerView2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        View view1 = inflater.inflate(R.layout.fragment_contact, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.time_recyclerView);
        recyclerView2 = (RecyclerView) view.findViewById(R.id.pro_main_recylerview);
        productrecycler();
        MiantainceTimeAdpater listAdapter = new MiantainceTimeAdpater();
        recyclerView.setAdapter(listAdapter);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        return view;
    }

    private void productrecycler() {
        MaintainanceProductAdapter servicesAdapter = new  MaintainanceProductAdapter();
        recyclerView2.setAdapter(servicesAdapter);
        RecyclerView.LayoutManager layoutManager1 =new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        recyclerView2.setLayoutManager(layoutManager1);
    }



}
