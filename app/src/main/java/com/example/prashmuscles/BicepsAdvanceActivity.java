package com.example.prashmuscles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class BicepsAdvanceActivity extends AppCompatActivity {
    String[] names = {"1) Barbell lying preacher curl upper arms", "2) Dumbbell one arm prone curl upper arms ",
    };
    ImageButton prev2;
    ImageButton next2;
    GifImageView pic;
    TextView text;
    int currentImage = 0;
    // 0-1-2-3-4-5-4-3-2-1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps_advance);
    }
    public void openadvanceBicepsActivity(View view) {
        Intent intent = new Intent(this, BicepsAdvanceActivity.class);
        startActivity(intent);

    }
    public void openadvanceBicepsActivity2(View view) {
        Toast.makeText(this, "This 2 Workouts Are Advance Workouts", Toast.LENGTH_SHORT).show();

    }
    public void prev39011(View v) {
        text = findViewById(R.id.textnamebiceps29011);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (2 + currentImage - 1) % 2;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);

    }

    public void next39011(View v) {
        text = findViewById(R.id.textnamebiceps29011);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (currentImage + 1) % 2;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);
    }
}