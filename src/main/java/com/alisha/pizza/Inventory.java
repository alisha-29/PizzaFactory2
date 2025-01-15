package com.alisha.pizza;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Integer> ingredients = new HashMap<>();

    public void addItem(String ingredient, int quantity) {
        ingredients.put(ingredient, ingredients.getOrDefault(ingredient, 0) + quantity);
    }

    public boolean checkAvailability(String ingredient, int quantity) {
        return ingredients.getOrDefault(ingredient, 0) >= quantity;
    }

    public void useItem(String ingredient, int quantity) {
        ingredients.put(ingredient, ingredients.getOrDefault(ingredient, 0) - quantity);
    }
}

