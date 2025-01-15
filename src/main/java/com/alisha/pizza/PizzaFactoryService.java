package com.alisha.pizza;

public class PizzaFactoryService {
    private Inventory inventory;

    public PizzaFactoryService(Inventory inventory) {
        this.inventory = inventory;
    }

    public boolean placeOrder(Order order) {
        if (isInventoryAvailable(order)) {
            order.processOrder();
            updateInventory(order);
            return true;
        }
        return false;
    }

    private boolean isInventoryAvailable(Order order) {
        for (Pizza pizza : order.getPizzas()) {
            for (Topping topping : pizza.getToppings()) {
                if (!inventory.checkAvailability(topping.getName(), 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    private void updateInventory(Order order) {
        for (Pizza pizza : order.getPizzas()) {
            for (Topping topping : pizza.getToppings()) {
                inventory.useItem(topping.getName(), 1);
            }
        }
    }
}

