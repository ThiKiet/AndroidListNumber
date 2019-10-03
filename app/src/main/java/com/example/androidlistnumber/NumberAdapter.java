package com.example.androidlistnumber;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberViewHolder> {
    int[] arrNumber ;
    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NumberAdapter.NumberViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class NumberViewHolder extends RecyclerView.ViewHolder{

        TextView textViewNumber;
        public NumberViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNumber = itemView.findViewById(R.id.test_number);
        }
    }
}
