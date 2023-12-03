package com.example.playsomeaudios;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

  ImageView img1,img2,img3,img4,img5,img6,img7;
  MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=findViewById(R.id.imageView1);
        img2=findViewById(R.id.imageView2);
        img3=findViewById(R.id.imageView3);
        img4=findViewById(R.id.imageView4);
        img5=findViewById(R.id.imageView5);
        img6=findViewById(R.id.imageView6);
        img7=findViewById(R.id.imageView7);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //changing icon pause to play after start the song
                if(img1.getTag() != null && img1.getTag().toString().contains("NOT_PLAYING")){

                    if(mediaPlayer !=null) mediaPlayer.release(); //release past song and reload song again
                    mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.song1);//push song
                    mediaPlayer.start();//start the song by click
                    img1.setImageResource(R.drawable.pauseicon);
                    img1.setTag("PLAYING_NOW");//set tag for play

                    img2.setImageResource(R.drawable.playicon);
                    img2.setTag("NOT_PLAYING");//set tag for play
                    img3.setImageResource(R.drawable.playicon);
                    img3.setTag("NOT_PLAYING");
                    img4.setImageResource(R.drawable.playicon);
                    img4.setTag("NOT_PLAYING");

                    //After complete the song change play to pause button
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            img1.setImageResource(R.drawable.playicon);//load icon
                            img1.setTag("NOT_PLAYING");//set tag for not play
                        }
                    });
                }
                //changing icon play to pause after click to pause
                else{
                    if(mediaPlayer !=null) mediaPlayer.release();
                    img1.setImageResource(R.drawable.playicon);
                    img1.setTag("NOT_PLAYING");//set tag for not play
                }

            }
        });
        //------------------------------------------------------------------------------------------------------
        //----------------------------------------------------------------------------------------------------
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //changing icon pause to play after start the song
                if(img2.getTag() != null && img2.getTag().toString().contains("NOT_PLAYING")){


                    if(mediaPlayer !=null) mediaPlayer.release(); //release past song and reload song again
                    mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.guzarish);//push song
                    mediaPlayer.start();//start the song by click
                    img2.setImageResource(R.drawable.pauseicon);
                    img2.setTag("PLAYING_NOW");//set tag for play

                    img1.setImageResource(R.drawable.playicon);
                    img1.setTag("NOT_PLAYING");//set tag for play
                    img3.setImageResource(R.drawable.playicon);
                    img3.setTag("NOT_PLAYING");
                    img4.setImageResource(R.drawable.playicon);
                    img4.setTag("NOT_PLAYING");


                    //After complete the song change play to pause button
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            img2.setImageResource(R.drawable.playicon);//load icon
                            img2.setTag("NOT_PLAYING");//set tag for not play
                        }
                    });
                }
                //changing icon play to pause after click to pause
                else{
                    if(mediaPlayer !=null) mediaPlayer.release();
                    img2.setImageResource(R.drawable.playicon);
                    img2.setTag("NOT_PLAYING");//set tag for not play
                }

            }
        });
        //----------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //changing icon pause to play after start the song
                if(img3.getTag() != null && img3.getTag().toString().contains("NOT_PLAYING")){


                    if(mediaPlayer !=null) mediaPlayer.release(); //release past song and reload song again
                    mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.letmedown);//push song
                    mediaPlayer.start();//start the song by click
                    img3.setImageResource(R.drawable.pauseicon);
                    img3.setTag("PLAYING_NOW");//set tag for play

                    img1.setImageResource(R.drawable.playicon);
                    img1.setTag("NOT_PLAYING");//set tag for play
                    img2.setImageResource(R.drawable.playicon);
                    img2.setTag("NOT_PLAYING");
                    img4.setImageResource(R.drawable.playicon);
                    img4.setTag("NOT_PLAYING");


                    //After complete the song change play to pause button
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            img3.setImageResource(R.drawable.playicon);//load icon
                            img3.setTag("NOT_PLAYING");//set tag for not play
                        }
                    });
                }
                //changing icon play to pause after click to pause
                else{
                    if(mediaPlayer !=null) mediaPlayer.release();
                    img3.setImageResource(R.drawable.playicon);
                    img3.setTag("NOT_PLAYING");//set tag for not play
                }

            }
        });
        //----------------------------------------------------------------
        //--------------------------------------------------------------------
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //changing icon pause to play after start the song
                if(img4.getTag() != null && img4.getTag().toString().contains("NOT_PLAYING")){


                    if(mediaPlayer !=null) mediaPlayer.release(); //release past song and reload song again
                    mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.yeduniya);//push song
                    mediaPlayer.start();//start the song by click
                    img4.setImageResource(R.drawable.pauseicon);
                    img4.setTag("PLAYING_NOW");//set tag for play

                    img1.setImageResource(R.drawable.playicon);
                    img1.setTag("NOT_PLAYING");//set tag for play
                    img2.setImageResource(R.drawable.playicon);
                    img2.setTag("NOT_PLAYING");
                    img3.setImageResource(R.drawable.playicon);
                    img3.setTag("NOT_PLAYING");


                    //After complete the song change play to pause button
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            img4.setImageResource(R.drawable.playicon);//load icon
                            img4.setTag("NOT_PLAYING");//set tag for not play
                        }
                    });
                }
                //changing icon play to pause after click to pause
                else{
                    if(mediaPlayer !=null) mediaPlayer.release();
                    img4.setImageResource(R.drawable.playicon);
                    img4.setTag("NOT_PLAYING");//set tag for not play
                }

            }
        });





    }
}