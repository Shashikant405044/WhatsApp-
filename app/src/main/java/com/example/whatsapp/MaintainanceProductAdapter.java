package com.example.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MaintainanceProductAdapter extends RecyclerView.Adapter{

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.maintainancproduct,parent,false);

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
        ImageView imageView;
        Button btncheck;
        TextView textView;

        public ListViewAdapter(@NonNull View itemView) {

            super(itemView);

            btncheck=(Button) itemView.findViewById(R.id.button);
            imageView =itemView.findViewById(R.id.img_ser);
            textView=(TextView) itemView.findViewById(R.id.txt_ser);

            btncheck.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                }
            });
        }
        public void bindView(int position){

            textView.setText(OurData.textservices[position]);
            imageView.setImageResource(OurData.image[position]);
        }

    }
}

