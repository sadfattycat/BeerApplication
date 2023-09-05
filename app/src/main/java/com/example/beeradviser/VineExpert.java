package com.example.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class VineExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        switch (color) {
            case "white":
                brands.add("Chardonnay");
                brands.add("Sauvignon Blanc");
                break;
            case "red":
                brands.add("Cabernet Sauvignon");
                brands.add("Merlot");
                break;
            case "rose":
                brands.add("Syrah Rose");
                brands.add("Pinor Noir Rose");
                break;
            case "vermouth":
                brands.add("Vermouth Secco");
                brands.add("Vermouth Rosso");
                break;
            default:
                brands.add("Brut");
                brands.add("Prosecco");
                break;
        }
        return brands;
    }
}
