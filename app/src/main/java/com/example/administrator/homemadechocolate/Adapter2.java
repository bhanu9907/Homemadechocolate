package com.example.administrator.homemadechocolate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.viewholder2> {
    private LayoutInflater inflater;
    private List<Model2> md;
    public Adapter2(Context mctx, List<Model2> md) {
        inflater =LayoutInflater.from(mctx);
        this.md = md;
    }

    @NonNull

    @Override
    public Adapter2.viewholder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_layout2, parent, false);
        Adapter2.viewholder2 holder = new Adapter2.viewholder2(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter2.viewholder2 holder, int position) {

        holder.img.setImageResource(md.get(position).getImg());
        holder.heading.setText(md.get(position).getText1());
        holder.heading2.setText(md.get(position).getText2());

    }


    @Override
    public int getItemCount() {
        return md.size();
    }

    public  class viewholder2 extends RecyclerView.ViewHolder{
        TextView heading;
        TextView heading2;
        Button a ;
        ImageView img;
        public viewholder2(View itemView) {
            super(itemView);
            heading = itemView.findViewById(R.id.t1);
            img = itemView.findViewById(R.id.image1);
            heading2 = itemView.findViewById(R.id.t2);
            a =itemView.findViewById(R.id.bt);


        }
    }
}
