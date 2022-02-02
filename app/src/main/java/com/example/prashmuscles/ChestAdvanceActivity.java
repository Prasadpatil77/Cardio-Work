package com.example.prashmuscles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class ChestAdvanceActivity extends AppCompatActivity {
    String[] names = {"1)  assisted chest dip kneeling chest",
            " 2) cable incline fly chest", "3) chest dip chest",
            "4) barbell decline bench press chest ", "5) dumbbell decline fly chest",
            " 6) dumbbell lying hammer press chest", "7) lever incline chest press chest ",
            "8) smith bench press chest ", "9) smith decline bench press chest",
            " 10) smith incline bench press chest",
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
        setContentView(R.layout.activity_chest_advance);
    }

    public void openadvancechestActivity(View view) {
        Intent intent = new Intent(this, ChestAdvanceActivity.class);
        startActivity(intent);

    }
    public void openadvancechestActivity2(View view) {
        Toast.makeText(this, "This All Next 10 Workouts Are Advance Workouts", Toast.LENGTH_SHORT).show();

    }

    public void adprev3902233(View v) {
        text = findViewById(R.id.textnamechest2902233);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (10 + currentImage - 1) % 10;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);

    }

    public void adnext3902233(View v) {
        text = findViewById(R.id.textnamechest2902233);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (currentImage + 1) % 10;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);

    }
}