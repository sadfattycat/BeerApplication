package com.example.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TheFirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_first);
    }

    public void onClickBeerActivity(View view) {
        Button beerbtn = findViewById(R.id.beer);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to Beer Bar!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickVineActivity(View view) {
        Button vinebtn = findViewById(R.id.vine);
        Intent intent = new Intent(this, VineActivity.class);
        startActivity(intent);
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to Vine Bar!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickVodkaActivity(View view) {
        Button vodkabtn = findViewById(R.id.vodka);
        Intent intent = new Intent(this, VodkaActivity.class);
        startActivity(intent);
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to Vodka Bar!", Toast.LENGTH_SHORT);
        toast.show();
    }
}