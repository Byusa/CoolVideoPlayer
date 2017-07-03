package com.example.serge.videodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView = (VideoView) findViewById(R.id.videoView);



        videoView.setVideoPath("android.resource://" + getPackageName() + "/"+ R.raw.movingshoe); //Path of the video


        //videoView.setVideoPath("https://www.instagram.com/p/BFqFBLsk2Ne/?taken-by=sergejbyusa"); //Adding an online video

        MediaController mediaController = new MediaController(this); // to control your video

        mediaController.setAnchorView(videoView); //the controllers.

        videoView.setMediaController(mediaController);

        videoView.start(); // starting the video




    }
}
