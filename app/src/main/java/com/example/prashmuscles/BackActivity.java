package com.example.prashmuscles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class BackActivity extends AppCompatActivity {
    String[] names = {"1) cable pulldown pro lat bar back", "2) cable reverse grip straight back seated high row back",
            " 3) barbell bent overrow back fix", "4) barbell reverse grip bent over row back fix ",
            "5) dumbbell bent over row back back ", "6) dumbbell bent over row back fix",
            "7) cable straight back seated row back ", "8)lever bent over row plate loaded back ",
            " 9) assisted pull up back", "10) weighted pull up back "};
    ImageButton prev3;
    ImageButton next3;
    GifImageView pic;
    TextView text;
    int currentImage = 0;
    // 0-1-2-3-4-5-4-3-2-1


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
    }

    public void openBackActivity(View view) {
        Intent intent = new Intent(this, BackActivity.class);
        startActivity(intent);

    }

    public void openBackActivity2(View view) {
        Intent intent = new Intent(this, BackActivity.class);
        startActivity(intent);
    }
    public void openbackAdvanceActivity2(View view) {
        Intent intent = new Intent(this, AdvanceBackActivity.class);
        startActivity(intent);
    }

    public void prev3(View v) {
        text = findViewById(R.id.textnameback2);
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

    public void next3(View v) {
        text = findViewById(R.id.textnameback2);
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