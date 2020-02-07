package com.example.whatsapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import java.util.Calendar;

public class ChatFragment extends Fragment {
    Calendar myCalendar;

    RecyclerView recyclerView;
    RecyclerView servicesRecycler;
    EditText cla;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        View view1 = inflater.inflate(R.layout.fragment_chat, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recView);
        servicesRecycler=(RecyclerView)view.findViewById(R.id.services_recycler);
        servicesRecycle();
        ListAdapter listAdapter = new ListAdapter();
       recyclerView.setAdapter(listAdapter);
       RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
       recyclerView.setLayoutManager(layoutManager);
       return view;
    }


    private void servicesRecycle() {
        ServicesAdapter servicesAdapter = new  ServicesAdapter();
        servicesRecycler.setAdapter(servicesAdapter);
        RecyclerView.LayoutManager layoutManager1 =new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        servicesRecycler.setLayoutManager(layoutManager1);
    }
}
