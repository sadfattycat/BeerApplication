package com.example.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class VodkaActivity extends AppCompatActivity {

    VodkaExpert expert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vodka);
        expert = new VodkaExpert();
    }

    public void onClickBeerActivity(View view) {
        Button beerbtn = findViewById(R.id.beerbtn);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to Beer Bar!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickVineActivity(View view) {
        Button vinebtn = findViewById(R.id.vinebtn);
        Intent intent = new Intent(this, VineActivity.class);
        startActivity(intent);
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to Vine Bar!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickFindVodka(View view) {
        TextView brands = findViewById(R.id.textVodka);
        Button button = findViewById(R.id.button);
        Spinner spinner = findViewById(R.id.spinner);
        String vodkatype = String.valueOf(spinner.getSelectedItem());
        List<String> brandList = expert.getBrands(vodkatype);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand: brandList) {
            brandsFormatted.append(brand).append('\n');
        }
        brands.setText(brandsFormatted);
        Toast toast = Toast.makeText(getApplicationContext(), "Good choice!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickVodkaSnacks(View view) {
        Button buttonSnacks = findViewById(R.id.snackbtn);
        TextView textSnacks = findViewById(R.id.textSnacks);

        String[] vodkasnacks = getResources().getStringArray(R.array.vodkasnacks);
        textSnacks.setText(TextUtils.join("\n", vodkasnacks));
    }
}