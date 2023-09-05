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

public class VineActivity extends AppCompatActivity {

    VineExpert expert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vino);
        this.expert = new VineExpert();
    }

    public void onClickBeerActivity(View view) {
        Button beerbtn = findViewById(R.id.beerbtn);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to Beer Bar!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickFindVine(View view) {
        TextView brands = findViewById(R.id.textVine);
        Button button = findViewById(R.id.button);
        Spinner spinner = findViewById(R.id.spinner);
        String vinetype = String.valueOf(spinner.getSelectedItem());
        List<String> brandList = expert.getBrands(vinetype);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand: brandList) {
            brandsFormatted.append(brand).append('\n');
        }
        brands.setText(brandsFormatted);
        Toast toast = Toast.makeText(getApplicationContext(), "Good choice!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickVodkaActivity(View view) {
        Button vodkabtn = findViewById(R.id.vodkabtn);
        Intent intent = new Intent(this, VodkaActivity.class);
        startActivity(intent);
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to Vodka Bar!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickVineSnacks(View view) {
        Button buttonSnacks = findViewById(R.id.snackbtn);
        TextView textSnacks = findViewById(R.id.textSnacks);

        String[] vinesnacks = getResources().getStringArray(R.array.vinesnacks);
        textSnacks.setText(TextUtils.join("\n", vinesnacks));
    }
}