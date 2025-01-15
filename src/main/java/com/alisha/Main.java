package com.alisha;

import com.alisha.pizza.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addItem("Olive", 10);
        inventory.addItem("Chicken Tikka", 5);

        PizzaFactoryService service = new PizzaFactoryService(inventory);

        Pizza pizza = new Pizza("Non-Veg Supreme", PizzaType.NON_VEGETARIAN, Size.MEDIUM, CrustType.CHEESE_BURST,
                List.of(new Topping("Chicken Tikka", 35)));

        Order order = new Order(List.of(pizza));

        if (service.placeOrder(order)) {
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Order could not be processed.");
        }
    }
}
