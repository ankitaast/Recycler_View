package com.example.mylocation.recycler_view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Custom_Adapter extends RecyclerView.Adapter<Custom_Adapter.MyViewHolder> {
    String user[];
    Context context;
    Integer aicon[];

    public Custom_Adapter(Context context, String[] user, Integer[] icon) {
        this.user=user;
        this.aicon=icon;
        this.context=context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater li=LayoutInflater.from(context);
        View v=li.inflate(R.layout.list,viewGroup,false);
        return (new MyViewHolder(v));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        myViewHolder.iv.setImageResource(aicon[position]);
        myViewHolder.tv.setText(user[position]);


    }

    @Override
    public int getItemCount() {
        return user.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv;
        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            tv=itemView.findViewById(R.id.uname);
            iv=itemView.findViewById(R.id.iconn);
        }
    }
}
