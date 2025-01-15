package com.alisha.pizza;

import java.util.List;

public class Pizza {
    private String name;
    private PizzaType type;
    private Size size;
    private CrustType crust;
    private List<Topping> toppings;

    public Pizza(String name, PizzaType type, Size size, CrustType crust, List<Topping> toppings) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.crust = crust;
        this.toppings = toppings;
    }

    public double calculatePrice() {
        double price = 0;
        if (this.size == Size.SMALL) price = 150;
        else if (this.size == Size.MEDIUM) price = 200;
        else if (this.size == Size.LARGE) price = 325;

        for (Topping topping : toppings) {
            price += topping.getPrice();
        }
        return price;
    }

    public String getName() {
        return name;
    }

    public PizzaType getType() {
        return type;
    }

    public Size getSize() {
        return size;
    }

    public CrustType getCrust() {
        return crust;
    }

    public List<Topping> getToppings() {
        return toppings;
    }
}

