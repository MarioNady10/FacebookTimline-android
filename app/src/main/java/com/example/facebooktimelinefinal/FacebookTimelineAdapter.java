package com.example.facebooktimelinefinal;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FacebookTimelineAdapter extends RecyclerView.Adapter<FacebookTimelineAdapter.FacebookViewHolder> {
    ArrayList<Facebook_Items> data;

    public FacebookTimelineAdapter(ArrayList<Facebook_Items> data) {
        this.data = data;
    }
    OnItemClick Onitemclick = null;
    @NonNull
    @Override
    public FacebookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.facebook_items,parent,false);
        return new FacebookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FacebookViewHolder holder, int position) {
        holder.User_title.setText(data.get(position).getUser_Title());
        holder.Time.setText(data.get(position).getTime());
        holder.Post_text.setText(data.get(position).getPost_text());
        holder.Like_count.setText(data.get(position).getLike_count());
        holder.Like_button.setText(data.get(position).getLike());
        holder.Comment_button.setText(data.get(position).getComment());
        holder.Share_button.setText(data.get(position).getShare());
        holder.Like_image.setImageResource(data.get(position).getLike_image());
        holder.User_icon.setImageResource(data.get(position).getUser_icon());
        holder.Post_icon.setImageResource(data.get(position).getPost_icon());
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Onitemclick.OnItemclick(data.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class FacebookViewHolder extends RecyclerView.ViewHolder {
        TextView User_title , Time , Post_text,Like_count;
        Button Like_button , Comment_button , Share_button;
        ImageView Post_icon , User_icon,Like_image;
        public FacebookViewHolder(@NonNull View itemView) {
            super(itemView);
            User_title = itemView.findViewById(R.id.FaceBook_UserTitle);
            Time = itemView.findViewById(R.id.Time);
            Post_text = itemView.findViewById(R.id.Post_Text);
            Like_count = itemView.findViewById(R.id.like_count);
            Like_button = itemView.findViewById(R.id.like_button);
            Comment_button = itemView.findViewById(R.id.comment_button);
            Share_button = itemView.findViewById(R.id.Share_button);
            Post_icon = itemView.findViewById(R.id.post_Icon);
            User_icon = itemView.findViewById(R.id.FaceBook_userIcon);
            Like_image = itemView.findViewById(R.id.Like_Image);
        }
    }
}
