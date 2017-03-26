package com.esilv.s8.tpfinal;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Jessica on 22/03/2017.
 */
public class VideosViewHolder extends RecyclerView.ViewHolder{

    private TextView title;
    private TextView author;
    private TextView date;
    private TextView description;
    private ImageView thumbnail;
    private OnVideoSelectedListener onVideoSelectedListener;

    public VideosViewHolder(View itemView){
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title);
        author = (TextView) itemView.findViewById(R.id.author);
        date = (TextView) itemView.findViewById(R.id.date);
        description = (TextView) itemView.findViewById(R.id.description);
        thumbnail = (ImageView) itemView.findViewById(R.id.thumbnail);
    }

    public void bind(Video video){
        title.setText(video.getTitle());
        author.setText(video.getAuthor());
        date.setText((CharSequence) video.getDate());
        description.setText(video.getDescription());
        //thumbnail.setImage(video.getThumbnail());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return;
            }
        });
    }

    public void setOnVideoSelectedListener(OnVideoSelectedListener onVideoSelectedListener) {
        this.onVideoSelectedListener = onVideoSelectedListener;
    }
}
