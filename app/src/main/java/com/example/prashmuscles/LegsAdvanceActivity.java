package com.example.prashmuscles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class LegsAdvanceActivity extends AppCompatActivity {
    String[] names = {"1) barbell bench front squat thighs ", "2) barbell lunge thighs ",
            "3) barbell one leg squat thighs ", "4) barbell full squat side pov thighs ",
            "5) inverse leg curl on pull up cable machine thighs ", "6) smith front squat clean grip thighs ",
            "7) smith low bar squat thighs ", "8) split squats thighs ",
            "9) barbell split squat female thighs ", "10) dumbbell bench squat female thighs ",
            "11) dumbbell rear lunge female thighs ", "12) dumbbell bulgarian split squat female thighs ",
            "13) dumbbell goblet squat female thighs ", "14) dumbbell lateral step up female thighs ",
            "15) swiss ball leg curl "
    };
    ImageButton prev5;
    ImageButton next5;
    GifImageView pic;
    TextView text;
    int currentImage = 0;
    // 0-1-2-3-4-5-4-3-2-1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs_advance);
    }
    public void openadvanceLegsActivity6(View view) {
        Toast.makeText(this, "This all next 15 Workouts are advance Workouts", Toast.LENGTH_SHORT).show();

    }
    public void prev56(View v) {
        text = findViewById(R.id.textnamelegs2);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (15 + currentImage - 1) % 15;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);

    }

    public void next56(View v) {
        text = findViewById(R.id.textnamelegs2);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (currentImage + 1) % 15;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);
    }
}