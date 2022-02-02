package com.example.prashmuscles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class tricepActivity extends AppCompatActivity {
    String[] names = {"1) barbell close grip bench press upper arms ", "2) cable pushdown with rope attachment upper arms ",
            "3) cable standing one arm triceps extension upper arms ", "4) ez barbell incline triceps extension upper arms ",
            "5) barbell incline close grip bench press upper arms ", "6) cable high pulley overhead tricep extension upper arms ",
            "7) ez bar lying close grip triceps extension behind head upper arms ", "8) ez barbell decline triceps extension upper arms ",
           };
    ImageButton prev105;
    ImageButton next105;
    GifImageView pic;
    TextView text;
    int currentImage = 0;
    // 0-1-2-3-4-5-4-3-2-1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tricep);
    }

    public void openTricepeactivity(View view) {
        Intent intent = new Intent(this, tricepActivity.class);
        startActivity(intent);

    }

    public void openTricepeactivity2(View view) {
        Intent intent = new Intent(this, tricepActivity.class);
        startActivity(intent);
    }
    public void openadvancetricepsActivity(View view) {
        Intent intent = new Intent(this, AdvanceTricepsActivity.class);
        startActivity(intent);
    }

    public void prev1052(View v) {
        text = findViewById(R.id.textviewtriceps);
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

    public void next1052(View v) {
        text = findViewById(R.id.textviewtriceps);
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