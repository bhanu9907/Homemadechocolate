package com.example.administrator.homemadechocolate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter1 extends RecyclerView.Adapter<Adapter1.viewholder1> {
    private LayoutInflater inflater;
 private List<Model1> model;
    public Adapter1(Context mctx, List<Model1> model) {
        inflater =LayoutInflater.from(mctx);
        this.model = model;
    }

    @NonNull

    @Override
    public viewholder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recycleronedesign, parent, false);
        viewholder1 holder = new viewholder1(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder1 holder, int position) {
holder.heading.setText(model.get(position).getText());
holder.img.setImageResource(model.get(position).getImage1());
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public  class viewholder1 extends RecyclerView.ViewHolder{
TextView heading;
ImageView img;
        public viewholder1(View itemView) {
            super(itemView);
           heading = itemView.findViewById(R.id.text1);
           img = itemView.findViewById(R.id.img1);

        }
    }
}
