package com.example.androidrockpaperscissors.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidrockpaperscissors.R;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        buttonsSetup();
    }

    private void buttonsSetup(){
        setUpPlayButton();
        setUpSettingsButton();
    }

    private void setUpSettingsButton() {
        Button settingsButton = findViewById(R.id.settingBtn);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settingsIntent = Settings.settingsIntent(MainMenu.this);
                startActivity(settingsIntent);
            }
        });
    }

    private void setUpPlayButton() {
        Button playButton = findViewById(R.id.playBtn);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Do something
            }
        });
    }

    private static Intent mainMenuIntent(Context context){
        return new Intent(context, MainMenu.class);
    }

}