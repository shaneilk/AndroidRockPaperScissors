package com.example.androidrockpaperscissors.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.androidrockpaperscissors.R;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        setUpRadioGroup();
    }

    public static Intent settingsIntent(Context context){
        return new Intent(context, Settings.class);
    }

    private void setUpRadioGroup() {
        setUpGameModeRadioGroup();
        setUpGameLengthRadioGroup();
    }

    private void setUpGameLengthRadioGroup() {
        Resources resources = getResources();
        RadioGroup radioGroup = findViewById(R.id.gameLengthRadioGroup);
        int[] gameLengthValues = resources.getIntArray(R.array.gameLengths);
        for (int i = 0; i < gameLengthValues.length; i++){
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText("" + gameLengthValues[i]);
            radioGroup.addView(radioButton);
        }
    }

    private void setUpGameModeRadioGroup() {
        Resources resources = getResources();
        RadioGroup radioGroup = findViewById(R.id.gameModesRadioGroup);
        String[] gameModeNames = resources.getStringArray(R.array.gameModes);
        for (int i = 0; i < gameModeNames.length; i++){
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText("" + gameModeNames[i]);
            radioGroup.addView(radioButton);
        }
    }
}