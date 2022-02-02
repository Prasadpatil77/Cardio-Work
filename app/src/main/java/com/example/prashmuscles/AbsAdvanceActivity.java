package com.example.prashmuscles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class AbsAdvanceActivity extends AppCompatActivity {
    String[] names = {" 1) hanging leg hip raise waist", "2) band assisted wheel rollout waist ",
            " 3) cable reverse crunch waist", "4) dumbbell stiff leg deadlift waist",
            "5) landmine waist ", "6) otis up waist",
            " 7) pull in on stability ball waist", "8) suspended abdominal fallout waist ",
            "9) suspended reverse crunch waist ", "10) weighted russian twist legs up waist ",
            "11) wheel rollout waist fix ", "12) weighted lying twist waist",
            "13) bent knee lying twist waist"
    };
    ImageButton adprev6;
    ImageButton adnext6;
    GifImageView pic;
    TextView text;
    int currentImage = 0;
    // 0-1-2-3-4-5-4-3-2-1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_advance);
    }

    public void openAbsAdvanceActivity(View view) {
        Intent intent = new Intent(this, AbsAdvanceActivity.class);
        startActivity(intent);

    }

    public void openAbsAdvanceActivity2(View view) {
        Toast.makeText(this, "This All Next 12 Workouts Are Advance Workouts", Toast.LENGTH_SHORT).show();


    }
    public void adprev6(View v) {
        text = findViewById(R.id.textnameabs2);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (13 + currentImage - 1) % 13;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);

    }

    public void adnext6(View v) {
        text = findViewById(R.id.textnameabs2);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (currentImage + 1) % 13;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);
    }
}