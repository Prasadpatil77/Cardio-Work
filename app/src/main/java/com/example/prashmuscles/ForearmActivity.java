package com.example.prashmuscles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class ForearmActivity extends AppCompatActivity {

    String[] names = {"1) Back barbell curl ", "2) Palms down from barbell curl",
            " 3) Palms up barbell wrist curl", "4) Palms up barbell wrist curl 2 ",
            " 5) Palms up dumbell wrist curl"
    };
    ImageButton prev;
    ImageButton next;
    GifImageView pic;
    TextView text;
    int currentImage = 0;
    // 0-1-2-3-4-5-4-3-2-1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forearm);
    }

    public void openForearmActivity2(View view) {
        Intent intent = new Intent(this, ForearmActivity.class);
        startActivity(intent);
    }
    public void openadvanceforearmActivity(View view) {
        Toast.makeText(this, "All 5 Workouts are the advance Workouts of Forearm", Toast.LENGTH_SHORT).show();
    }
//    public void openForearmActivity2(View view){
//        Toast.makeText(this, "Advance workout After 11th Workout ", Toast.LENGTH_LONG).show();
//        Intent intent = new Intent(this,ForearmActivity.class);
//        startActivity(intent);
//
//    }

    public void prev105(View v) {
        text = findViewById(R.id.textviewforearm);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (5 + currentImage - 1) % 5;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);

    }

    public void next105(View v) {
        text = findViewById(R.id.textviewforearm);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (currentImage + 1) % 5;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);

    }
}