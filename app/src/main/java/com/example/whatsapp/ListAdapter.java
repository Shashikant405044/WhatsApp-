package com.example.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter{

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem,parent,false);

        return new ListViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewAdapter)holder).bindView(position);


    }

    @Override
    public int getItemCount() {
        return OurData.time.length;
    }

    private class ListViewAdapter extends RecyclerView.ViewHolder {
        Button timebtn;

        public ListViewAdapter(@NonNull View itemView) {

            super(itemView);

            timebtn=(Button)itemView.findViewById(R.id.timebtn);


        }
        public void bindView(int position){

            timebtn.setText(OurData.time[position]);
        }

    }
}
