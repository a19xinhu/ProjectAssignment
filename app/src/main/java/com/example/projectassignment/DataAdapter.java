package com.example.projectassignment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataAdapterViewHolder> {
    private List<Data> data;

    public DataAdapter(List<Data> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public DataAdapter.DataAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        Log.d("testing", "onCreateViewHolder");
        return new DataAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.DataAdapterViewHolder holder, int position) {
        //use function toString() at Data.java
        holder.data_name.setText(data.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class DataAdapterViewHolder extends RecyclerView.ViewHolder{
        private TextView data_name;
        public DataAdapterViewHolder(View itemView){
            super(itemView);
            data_name = itemView.findViewById(R.id.data_name);
        }
    }
}
