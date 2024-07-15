package com.example.adapter_class_telefon_rehber;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Data_Adapter extends RecyclerView.Adapter<Data_Adapter.MyviewHolder> {
    Context context;
    ArrayList<data> dataModel;
    public Data_Adapter(Context context, ArrayList<data> dataModel){
        this.context =context;
        this.dataModel = dataModel;
    }
    @NonNull
    @Override
    public Data_Adapter.MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.listele_view_row,parent,false);
        return new Data_Adapter.MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Data_Adapter.MyviewHolder holder, int position) {
        holder.textViewad.setText(dataModel.get(position).getName());
        holder.textViewDurum.setText(dataModel.get(position).getDurum());
    }

    @Override
    public int getItemCount() {
        return dataModel.size();
    }
    public static  class MyviewHolder extends  RecyclerView.ViewHolder{

        TextView textViewad,textViewDurum;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            textViewad = itemView.findViewById(R.id.textView3);
            textViewDurum = itemView.findViewById(R.id.textView);
        }
    }
}
