package com.jaden.playimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.jaden.imageviewplay.ImageViewPlay;


public class MainActivity extends AppCompatActivity {
    private ImageViewPlay ivp1;
    private ImageViewPlay ivp2;
    private ImageViewPlay ivp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivp1 = findViewById(R.id.ivp1);
        ivp2 = findViewById(R.id.ivp2);
        ivp3 = findViewById(R.id.ivp3);
        loadPic();
    }

    private void loadPic(){
        ivp1.setType(ImageViewPlay.TYPE_IMAGE);
        ivp2.setType(ImageViewPlay.TYPE_VIDEO);
        ivp3.setType(ImageViewPlay.TYPE_VIDEO);
        Glide.with(this).load("file:///android_asset/pic.jpg").into(ivp1);
        Glide.with(this).load("file:///android_asset/landscape_video.jpg").into(ivp2);
        Glide.with(this).load("file:///android_asset/portrait_video.jpg").into(ivp3);
    }

}
