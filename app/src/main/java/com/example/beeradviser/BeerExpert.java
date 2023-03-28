package com.example.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands (String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else if (color.equals("light")) {
            brands.add("Pilsner Urquell");
            brands.add("Stella Artois");
        } else if (color.equals("brown")) {
            brands.add("Genesee Honey Brown Ale");
            brands.add("Brooklyn Brown Ale");
        } else {
            brands.add("Guinness Extra Stout");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
