package com.example.facebooktimelinefinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.RecoverySystem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView FacebookrecyclerView;
    FacebookTimelineAdapter facebookTimelineAdapter;
    ArrayList<Facebook_Items> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        FacebookrecyclerView = findViewById(R.id.FaceBook_RecyclerView);
        intializedata();
        facebookTimelineAdapter = new FacebookTimelineAdapter(data);
        FacebookrecyclerView.setAdapter(facebookTimelineAdapter);

        facebookTimelineAdapter.Onitemclick = new OnItemClick() {
            @Override
            public void OnItemclick(Facebook_Items facebook_items) {
                Intent intent = new Intent(MainActivity.this, postdetails.class);
                intent.putExtra("postauthe", Facebook_Items.class);
                startActivity(intent);
            }
        };

    }

    public void intializedata() {
        data = new ArrayList<Facebook_Items>(1000);
        for (int i = 1; i < 1000; i++) {
            data.add(new Facebook_Items("User "+i, +i +"h",
                    "hello user"+i, ""+i, "like "+i,
                    "comment "+i,
                    "share "+i, R.drawable.like_24,
                    R.drawable.post_photo_24, R.drawable.account_24));
        }
    }
}