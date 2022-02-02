package com.example.prashmuscles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class BicepsActivity extends AppCompatActivity {
    String[] names = {"1) barbell curl upper arms ", "2) dumbbell biceps curl upper arms ",
            "3) dumbbell incline biceps curl upper arms ", "4) ez barbell curl upper arms ",
            " 5) ez barbell close grip preacher curl upper arms", "6) cable close grip curl upper arms ",
            "7) dumbbell alternate preacher curl upper arms ", "8) cable one arm biceps curl version upper arms ",
    };
    ImageButton prev2;
    ImageButton next2;
    GifImageView pic;
    TextView text;
    int currentImage = 0;
    // 0-1-2-3-4-5-4-3-2-1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps);
    }

    public void openBicepsActivity(View view) {
        Intent intent = new Intent(this, BicepsActivity.class);
        startActivity(intent);

    }

    public void openBicepsActivity2(View view) {
        Intent intent = new Intent(this, BicepsActivity.class);
        startActivity(intent);

    }
    public void openadvanceBicepsActivity(View view) {
        Intent intent = new Intent(this, BicepsAdvanceActivity.class);
        startActivity(intent);

    }

    public void prev390(View v) {
        text = findViewById(R.id.textnamebiceps290);
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

    public void next390(View v) {
        text = findViewById(R.id.textnamebiceps290);
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