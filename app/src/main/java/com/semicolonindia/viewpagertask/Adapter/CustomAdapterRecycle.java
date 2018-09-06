package com.semicolonindia.viewpagertask.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.semicolonindia.viewpagertask.Pojo;
import com.semicolonindia.viewpagertask.R;

import java.util.List;

/**
 * Created by RANJAN SINGH on 8/16/2017.
 */
@SuppressWarnings("ALL")
public class CustomAdapterRecycle extends RecyclerView.Adapter<CustomAdapterRecycle.ViewHolder>
{
    List<Pojo> itemList;
    Context context;

    public CustomAdapterRecycle(Context context, List<Pojo> itemList) {
        //super(context);
        this.context = context;
        this.itemList=itemList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_row, null);
        return new ViewHolder(layoutView);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.cardText.setText(itemList.get(position).getName());
        holder.cardImage.setImageResource(itemList.get(position).getImage());

    }

    @Override
    public int getItemCount() {

        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // Declear all variable
        ImageView cardImage;
        TextView cardText;

        public ViewHolder(View itemView) {
            super(itemView);
            // Intializing all
            cardImage = itemView.findViewById(R.id.iv_cardImage);
            cardText=itemView.findViewById(R.id.tv_cardText);

        }
    }

}
