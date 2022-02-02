package com.example.prashmuscles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class HippAdvanceActivity extends AppCompatActivity {
    String[] names = {  "1) barbell bench squat hips ", "2) barbell front squat hips fix  ",
            "3) barbell romanian deadlift hips  ", "4) decline sit up hips ",
            "5) hanging straight leg raise hips ", "6) cable standing hip extension hips ",
            "7) lunge hips ", "8) sled 45 degrees one leg press hips ",
            "9) sled leg press hips ", "10) step up hips ",
            "11) dumbbell step up hips ", "12) lying scissor kick hips ",
            "13) lying hip straight leg raise hips ", "14) dumbbell lunge hips ",
            "15) bench full squat female hips ", "16) barbell step up female hips ",
    };
    ImageButton prev7;
    ImageButton next7;
    GifImageView pic;
    TextView text;
    int currentImage = 0;
    // 0-1-2-3-4-5-4-3-2-1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hipp_advance);
    }
    public void openadvanceHippsActivity23(View view) {
        Toast.makeText(this, "This all Next 16 Workouts are Advance Workouts", Toast.LENGTH_SHORT).show();
    }
    public void prev72(View v) {
        text = findViewById(R.id.textnameHipps2);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (16 + currentImage - 1) % 16;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);

    }

    public void next72(View v) {
        text = findViewById(R.id.textnameHipps2);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (currentImage + 1) % 16;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);
    }
}