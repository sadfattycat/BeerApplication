package com.example.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class VodkaExpert {
    List<String> getBrands(String type) {
        List<String> brands = new ArrayList<>();
        switch (type) {
            case "plain":
                brands.add("Ketel One");
                brands.add("Absolut");
                break;
            case "flavored":
                brands.add("Finlandia Cranberry");
                brands.add("Effen Blood Orange");
                break;
            case "fruit":
                brands.add("New Amsterdam Peach Vodka");
                brands.add("Deep Eddy Ruby Red Vodka");
                break;
            default:
                brands.add("Grey Goose Vodka");
                brands.add("Wheatley Vodka");
                break;
        }
        return brands;
    }
}
