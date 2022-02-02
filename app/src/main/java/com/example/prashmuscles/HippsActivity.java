package com.example.prashmuscles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class HippsActivity extends AppCompatActivity {
    String[] names = {"1) barbell deadlift hips fix ", "2) barbell lying lifting on hip hips ",
            "3) barbell rack pull hips ", "4) barbell sumo deadlift hips ",
            "5) sled hack squat hips ", "6) vertical leg raise on parallel bars hips ",
            "7) lever hip extension version hips ", "8) cable pull through with rope hip",
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
        setContentView(R.layout.activity_hipps);
    }

    public void openHippsActivity(View view) {
        Intent intent = new Intent(this, HippsActivity.class);
        startActivity(intent);

    }

    public void openHippsActivity2(View view) {
        Intent intent = new Intent(this, HippsActivity.class);
        startActivity(intent);

    }
    public void openadvanceHippsActivity(View view) {
        Intent intent = new Intent(this, HippAdvanceActivity.class);
        startActivity(intent);

    }

    public void prev7(View v) {
        text = findViewById(R.id.textnameHipps);
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

    public void next7(View v) {
        text = findViewById(R.id.textnameHipps);
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