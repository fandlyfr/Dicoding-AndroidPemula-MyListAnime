package com.example.mylistanime;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridAnimeAdapter extends RecyclerView.Adapter<GridAnimeAdapter.GridViewHolder> {
    private Context context;
    private ArrayList<Anime> listAnime;

    private ArrayList<Anime> getListPresident() {
        return listAnime;
    }

    public void setListPresident(ArrayList<Anime> listPresident) {
        this.listAnime = listPresident;
    }

    public GridAnimeAdapter(Context context) {
        this.context = context;
    }

    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_anime, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        Glide.with(context)
                .load(getListPresident().get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);


    }

    @Override
    public int getItemCount() {
        return getListPresident().size();
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }

    }
}