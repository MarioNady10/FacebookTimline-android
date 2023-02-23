package com.example.facebooktimelinefinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class postdetails extends AppCompatActivity {
ImageView user_icon,posticon;
TextView user_title,time;
Intent intent = getIntent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postdetails);
        user_title.setText(intent.getStringExtra("postauther"));
        posticon.setImageResource(intent.getIntExtra("postIcon",R.drawable.account_24));
        user_title = findViewById(R.id.FaceBook_UserTitle2);
        user_icon = findViewById(R.id.FaceBook_userIcon2);
        time=findViewById(R.id.Time2);
        posticon=findViewById(R.id.post_Icon2);





    }
}