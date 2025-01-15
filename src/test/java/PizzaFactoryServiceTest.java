import com.alisha.pizza.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PizzaFactoryServiceTest {
    @Test
    public void testPizzaPriceCalculation() {
        Topping olive = new Topping("Olive", 20);
        Pizza pizza = new Pizza("Deluxe Veggie", PizzaType.VEGETARIAN, Size.MEDIUM, CrustType.HAND_TOSSED, List.of(olive));
        assertEquals(220, pizza.calculatePrice(), 0);
    }

    @Test
    public void testOrderPlacement() {
        Inventory inventory = new Inventory();
        inventory.addItem("Olive", 10);

        PizzaFactoryService service = new PizzaFactoryService(inventory);
        Pizza pizza = new Pizza("Deluxe Veggie", PizzaType.VEGETARIAN, Size.MEDIUM, CrustType.HAND_TOSSED, List.of(new Topping("Olive", 20)));
        Order order = new Order(List.of(pizza));

        assertTrue(service.placeOrder(order));
    }
}
