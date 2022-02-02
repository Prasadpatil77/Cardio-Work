package com.example.prashmuscles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class AdvanceShoulderActivity extends AppCompatActivity {
    String[] names = {"1) cable cross over revers fly shoulders ", "2) cable forward raise shoulders ",
            "3) cable rear delt row with rope shoulders ", "4) lever seated reverse fly parallel grip shoulder "};
    ImageButton prev4;
    ImageButton next4;
    GifImageView pic;
    TextView text;
    int currentImage = 0;
    // 0-1-2-3-4-5-4-3-2-1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_shoulder);
    }
    public void openadvanceShouldrActivity23(View view) {
        Toast.makeText(this, "This all Next 4 workouts Are Advance Workouts", Toast.LENGTH_SHORT).show();

    }

    public void adprev44(View v) {
        text = findViewById(R.id.textnameshoulder2);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (4 + currentImage - 1) % 4;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);

    }

    public void adnext44(View v) {
        text = findViewById(R.id.textnameshoulder2);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (currentImage + 1) % 4;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);
    }
}