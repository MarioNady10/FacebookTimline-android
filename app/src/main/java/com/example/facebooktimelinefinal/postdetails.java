package com.example.facebooktimelinefinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class postdetails extends AppCompatActivity {
ImageView user_icon,posticon;
TextView user_title,time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postdetails);
        user_icon = findViewById(R.id.post_Icon2);
        user_title = findViewById(R.id.FaceBook_UserTitle2);
        time = findViewById(R.id.Time2);
        posticon=findViewById(R.id.post_Icon2);
    }
}