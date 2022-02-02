package com.example.prashmuscles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class LegsActivity extends AppCompatActivity {
    String[] names = {"1) barbell rear lunge thighs ", "2) barbell clean grip front squat thighs ",
            "3) sled leg press hips ", "4) smith split squat thighs fix ",
            "5) lever leg extension thighs ", "6) barbell straight leg deadlift thighs ",
            "7) trap bar deadlift thighs ", "8) lever lying leg curl thighs ",
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
        setContentView(R.layout.activity_legs);
    }

    public void openLegsActivity(View view) {
        Intent intent = new Intent(this, LegsActivity.class);
        startActivity(intent);

    }

    public void openLegsActivity2(View view) {
        Intent intent = new Intent(this, LegsActivity.class);
        startActivity(intent);

    }
    public void openadvanceLegsActivity(View view) {
        Intent intent = new Intent(this, LegsAdvanceActivity.class);
        startActivity(intent);

    }

    public void prev5(View v) {
        text = findViewById(R.id.textnamelegs);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (8 + currentImage - 1) % 8;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);

    }

    public void next5(View v) {
        text = findViewById(R.id.textnamelegs);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (currentImage + 1) % 8;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);
    }
}