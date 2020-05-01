package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void  playPhrase(View view){

        Button button_pressed = (Button) view;
        Log.i("button pressed",button_pressed.getTag().toString());

        MediaPlayer mp = MediaPlayer.create(this, getResources().getIdentifier(button_pressed.getTag().toString(), "raw", getPackageName()));
        mp.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


