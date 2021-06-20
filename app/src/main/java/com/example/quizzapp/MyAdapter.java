package com.example.quizzapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<String> textArraylist;

    public MyAdapter(Context context, ArrayList<String> textArraylist) {
        this.context = context;
        this.textArraylist = textArraylist;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.textView.setText(textArraylist.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,MainActivity2.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return textArraylist.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        CardView cardView;
         public MyViewHolder(@NonNull View itemView) {
             super(itemView);
             textView=itemView.findViewById(R.id.quiz_name);
             cardView=itemView.findViewById(R.id.card_quiz);

         }
     }
}
