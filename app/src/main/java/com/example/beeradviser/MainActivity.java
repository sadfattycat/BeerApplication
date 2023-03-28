package com.example.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();

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
}

