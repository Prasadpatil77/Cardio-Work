package com.example.prashmuscles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class AbsActivity extends AppCompatActivity {
    String[] names = {"1) bottoms up m waist", "2) incline leg hip raise leg straight waist",
            "3)  seated leg raise waist", "4) hanging leg hip raise waist"
            , "5) cable standing lift waist ", "6)  cable twist up down waist",
            "7) cable twist waist ", "8) weighted russian twist waist"
    };
    ImageButton prev6;
    ImageButton next6;
    GifImageView pic;
    TextView text;
    int currentImage = 0;
    // 0-1-2-3-4-5-4-3-2-1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs);
    }

    public void openAbsActivity(View view) {
        Intent intent = new Intent(this, AbsActivity.class);
        startActivity(intent);

    }

    public void openAbsActivity2(View view) {
        Intent intent = new Intent(this, AbsActivity.class);
        startActivity(intent);

    }
    public void openAbsAdvanceActivity(View view) {
        Intent intent = new Intent(this, AbsAdvanceActivity.class);
        startActivity(intent);

    }

    public void prev6(View v) {
        text = findViewById(R.id.textnameabs);
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

    public void next6(View v) {
        text = findViewById(R.id.textnameabs);
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