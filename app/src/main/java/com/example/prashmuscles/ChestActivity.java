package com.example.prashmuscles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class ChestActivity extends AppCompatActivity {
    String[] names = {"1) barbell bench press chest", "2) dumbbell bench press chest",
            " 3) Barbell incline bench press chest", "4) barbell decline bench press chest ",
            " 5) lever chest press version chest", "6) dumbbell incline hammer press chest",
            "7) dumbbell incline fly chest fix ", "8) cable low fly chest ",
            " 9) cable middle fly chest", "10) cable standing up straight crossovers chest",
            "11) lever seated fly chest "
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
        setContentView(R.layout.activity_chest);
    }

    public void openThirdActivity(View view) {
        Intent intent = new Intent(this, ChestActivity.class);
        startActivity(intent);
    }

    public void openThirdActivity2(View view) {
        Intent intent = new Intent(this, ChestActivity.class);
        startActivity(intent);

    }
    public void openadvancechestActivity(View view) {
        Intent intent = new Intent(this, ChestAdvanceActivity.class);
        startActivity(intent);

    }

    public void adprev39022(View v) {
        text = findViewById(R.id.textnamechest29022);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (11 + currentImage - 1) % 11;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);

    }

    public void adnext39022(View v) {
        text = findViewById(R.id.textnamechest29022);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (currentImage + 1) % 11;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);

    }
}