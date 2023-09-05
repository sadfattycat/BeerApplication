package com.example.beeradviser;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view) {
        TextView brands = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);
        Spinner spinner = findViewById(R.id.spinner);
        String beertype = String.valueOf(spinner.getSelectedItem());
        List<String> brandList = expert.getBrands(beertype);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand: brandList) {
            brandsFormatted.append(brand).append('\n');
        }
        brands.setText(brandsFormatted);
        Toast toast = Toast.makeText(getApplicationContext(), "Good choice!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickVineActivity(View view) {
        Button vinebtn = findViewById(R.id.vinebtn);
        Intent intent = new Intent(this, VineActivity.class);
        startActivity(intent);
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to Vine Bar!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickVodkaActivity(View view) {
        Button vodkabtn = findViewById(R.id.vodkabtn);
        Intent intent = new Intent(this, VodkaActivity.class);
        startActivity(intent);
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to Vodka Bar!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickSnaks(View view) {
        Button buttonSnacks = findViewById(R.id.snackbtn);
        TextView textSnacks = findViewById(R.id.textSnacks);

        String[] beersnacks = getResources().getStringArray(R.array.beersnacks);
        textSnacks.setText(TextUtils.join("\n", beersnacks));
    }

}

