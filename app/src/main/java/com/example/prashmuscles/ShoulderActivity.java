package com.example.prashmuscles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class ShoulderActivity extends AppCompatActivity {
    String[] names = {"1) barbell standing close grip military press shoulders ",
            "2) dumbbell seated shoulder press shoulders ",
            "3) lever seated shoulder press shoulders ", "4) dumbbell front raise shoulders ",
            "5) dumbbell lateral raise shoulder ", "6) barbell upright row shoulder ",
            "7) cable one arm lateral raise shoulders ", "8) dumbbell rear fly shoulders ",
            "9) dumbbell rear lateral raise shoulders ", "10) barbell front raise shoulders ",
            "11) cable cross over revers fly shoulders ", "12) cable forward raise shoulders ",
            "13) cable rear delt row with rope shoulders ", "14) lever seated reverse fly parallel grip shoulder "};
    ImageButton prev4;
    ImageButton next4;
    GifImageView pic;
    TextView text;
    int currentImage = 0;
    // 0-1-2-3-4-5-4-3-2-1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder);
    }

    public void openShoulderActivity(View view) {
        Intent intent = new Intent(this, ShoulderActivity.class);
        startActivity(intent);

    }

    public void openShoulderActivity2(View view) {
        Intent intent = new Intent(this, ShoulderActivity.class);
        startActivity(intent);

    }
    public void openadvanceShouldrActivity2(View view) {
        Intent intent = new Intent(this,AdvanceShoulderActivity.class);
        startActivity(intent);

    }

    public void prev4(View v) {
        text = findViewById(R.id.textnameshoulder);
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

    public void next4(View v) {
        text = findViewById(R.id.textnameshoulder);
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