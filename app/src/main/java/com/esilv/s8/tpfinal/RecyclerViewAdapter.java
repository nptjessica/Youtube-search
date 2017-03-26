package com.esilv.s8.tpfinal;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import com.esilv.s8.tpfinal.VideosViewHolder;

/**
 * Created by Jessica on 22/03/2017.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<VideosViewHolder> {

    private List<Video> videos;
    private OnVideoSelectedListener onVideoSelectedListener;

    public RecyclerViewAdapter(List<Video> videos){
        this.videos = videos;
    }

    @Override
    public VideosViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell, parent, false);
        return new VideosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VideosViewHolder holder, int position) {
        holder.setOnVideoSelectedListener(onVideoSelectedListener);
        holder.bind(videos.get(position));
    }

    @Override
    public int getItemCount() {
        return videos != null ? videos.size() : 0;
    }


    public void setOnContractSelectedListener(SecondActivity secondActivity) {
        this.onVideoSelectedListener = onVideoSelectedListener;
    }
}
