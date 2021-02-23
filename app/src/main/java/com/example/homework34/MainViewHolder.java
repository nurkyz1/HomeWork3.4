package com.example.homework34;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MainViewHolder extends RecyclerView.ViewHolder {
    TextView text;
    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        text= itemView.findViewById(R.id.tv_one);
    }
    public void onBind( String data){
        text.setText(data);
    }
}
