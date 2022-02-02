package com.example.prashmuscles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class AdvanceBackActivity extends AppCompatActivity {
    String[] names = { "1)band assisted pull up back ", "2) barbell incline row rack ",
            "3)cable lateral pulldown with v bar back ", "4) cable palm rotational row back ",
            "5)cable standing twist row v bar back ", "6)  cable straight arm pulldown with rope back",
            " 7)cable thibaudeau kayak row back", " 8) chin up back",
            " 9) dumbbell deadlift back", "10) inverted row back fix ",
            " 11) inverted row on bench back", "12) inverted row rent knees back ",
            "13) inverted row with straps back ", " 14) squat back wrong right",
            " 15) degree hyperextension arms in front of chest back"};
    ImageButton prev3;
    ImageButton  next3;
    GifImageView pic;
    TextView text;
    int currentImage = 0;
    // 0-1-2-3-4-5-4-3-2-1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_back);
    }
    public void openbackAdvanceActivity2(View view) {
        Intent intent = new Intent(this, AdvanceBackActivity.class);
        startActivity(intent);
    }
    public void openbackAdvanceActivity23(View view) {
        Toast.makeText(this, "This All Next 15 Workouts Are Advance Workouts", Toast.LENGTH_SHORT).show();
    }
    public void adprev312(View v) {
        text = findViewById(R.id.adback534);
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

    public void adnext312(View v) {
        text = findViewById(R.id.adback534);
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