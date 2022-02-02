package com.example.prashmuscles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
//import android.nfc.Tag;
import android.os.Bundle;
//import android.util.Log;
import android.view.View;
import android.widget.Button;

public class InfoActivity extends AppCompatActivity {
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        submit = findViewById(R.id.submit23);
    }

    public void EmailButton(View view) {
        startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:patilprasad530@gmail.com")));
    }

    public void OpenInfoActivity(View view) {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);

    }

}