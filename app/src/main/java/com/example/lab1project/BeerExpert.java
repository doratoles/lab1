package com.example.lab1project;

import java.util.List;
import java.util.ArrayList;

public class BeerExpert {
    List<String> getBrands(String color) {

        List<String> brands = new ArrayList<>();

        if (color.equals("light")) {
            brands.add("Michelob Ultra");
        }
        if(color.equals("amber")) {
            brands.add("Rogue American");
        }
        if(color.equals("brown")) {
            brands.add("Sweetwater Georgia");
        }
        if(color.equals("dark")) {
            brands.add("Sumi Zest");
        }
        return brands;
    }
}
