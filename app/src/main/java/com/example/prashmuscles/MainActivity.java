package com.example.prashmuscles;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, InfoActivity.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void openThirdActivity(View view) {
        Intent intent = new Intent(this, ChestActivity.class);
        startActivity(intent);

    }

    public void openForearmActivity2(View view) {
        Intent intent = new Intent(this, ForearmActivity.class);
        startActivity(intent);
    }

    public void OpenInfoActivity(View view) {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }

    public void openTricepeactivity(View view) {
        Intent intent = new Intent(this, tricepActivity.class);
        startActivity(intent);
    }

    public void openBicepsActivity(View view) {
        Intent intent = new Intent(this, BicepsActivity.class);
        startActivity(intent);
    }

    public void openBackActivity(View view) {
        Intent intent = new Intent(this, BackActivity.class);
        startActivity(intent);
    }

    public void openShoulderActivity(View view) {
        Intent intent = new Intent(this, ShoulderActivity.class);
        startActivity(intent);
    }

    public void openLegsActivity(View view) {
        Intent intent = new Intent(this, LegsActivity.class);
        startActivity(intent);
    }

    public void openAbsActivity(View view) {
        Intent intent = new Intent(this, AbsActivity.class);
        startActivity(intent);
    }

    public void openHippsActivity(View view) {
        Intent intent = new Intent(this, HippsActivity.class);
        startActivity(intent);
    }

    public void openThirdActivity2(View view) {
        Intent intent = new Intent(this, ChestActivity.class);
        startActivity(intent);
    }

    public void openTricepeactivity2(View view) {
        Intent intent = new Intent(this, tricepActivity.class);
        startActivity(intent);
    }

    public void openBicepsActivity2(View view) {
        Intent intent = new Intent(this, BicepsActivity.class);
        startActivity(intent);
    }

    public void openBackActivity2(View view) {
        Intent intent = new Intent(this, BackActivity.class);
        startActivity(intent);
    }

    public void openShoulderActivity2(View view) {
        Intent intent = new Intent(this, ShoulderActivity.class);
        startActivity(intent);
    }

    public void openLegsActivity2(View view) {
        Intent intent = new Intent(this, LegsActivity.class);
        startActivity(intent);
    }

    public void openAbsActivity2(View view) {
        Intent intent = new Intent(this, AbsActivity.class);
        startActivity(intent);
    }

    public void openHippsActivity2(View view) {
        Intent intent = new Intent(this, HippsActivity.class);
        startActivity(intent);
    }

    ////////////////////////////////////  Advance Activities //////////////////////////////////////


    public void openAbsAdvanceActivity(View view) {
        Intent intent = new Intent(this, AbsAdvanceActivity.class);
        startActivity(intent);

    }

    public void openbackAdvanceActivity2(View view) {
        Intent intent = new Intent(this, AdvanceBackActivity.class);
        startActivity(intent);
    }

    public void openadvanceBicepsActivity(View view) {
        Intent intent = new Intent(this, BicepsAdvanceActivity.class);
        startActivity(intent);

    }

    public void openadvancechestActivity(View view) {
        Intent intent = new Intent(this, ChestAdvanceActivity.class);
        startActivity(intent);

    }

    public void openadvanceHippsActivity(View view) {
        Intent intent = new Intent(this, HippAdvanceActivity.class);
        startActivity(intent);

    }

    public void openadvanceLegsActivity(View view) {
        Intent intent = new Intent(this, LegsAdvanceActivity.class);
        startActivity(intent);

    }
    public void openadvancetricepsActivity(View view) {
        Intent intent = new Intent(this, AdvanceTricepsActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}