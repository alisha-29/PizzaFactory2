package com.alisha.pizza;

import java.util.List;

public class Order {
    private List<Pizza> pizzas;
    private boolean isProcessed;

    public Order(List<Pizza> pizzas) {
        this.pizzas = pizzas;
        this.isProcessed = false;
    }

    public double calculateTotal() {
        double total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.calculatePrice();
        }
        return total;
    }

    public void processOrder() {
        if (!isProcessed) {
            this.isProcessed = true;
        }
    }

    public boolean isProcessed() {
        return isProcessed;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void setProcessed(boolean processed) {
        isProcessed = processed;
    }
}

