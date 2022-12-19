package practs.pract_30;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InternetOrderTest {

    @org.junit.jupiter.api.Test
    void itemsQuantity() {
        InternetOrder order = new InternetOrder();
        order.add(new Drink(100, "Coca-Cola", "Coca-Cola", DrinkTypeEnum.SODA, 0));
        order.add(new Drink(100, "Coca-Cola", "Coca-Cola", DrinkTypeEnum.SODA, 0));
        Assert.assertEquals(order.itemsQuantity("Coca-Cola"), 2);
        Assert.assertEquals(order.itemsQuantity("Pepsi"), 0);
        Assert.assertEquals(order.itemsQuantity(), 2);
    }

    @Test
    void itemsNames() {
        InternetOrder order = new InternetOrder();
        order.add(new Drink(100, "Coca-Cola", "Coca-Cola", DrinkTypeEnum.SODA, 0));
        order.add(new Drink(120, "Coca-Cola", "Coca-Cola", DrinkTypeEnum.SODA, 0));
        order.add(new Drink(120, "Pepsi", "Pepsi", DrinkTypeEnum.SODA, 0));

        ArrayList<String> names = order.itemsNames();
        Assert.assertEquals(names.get(0), "Coca-Cola");
        Assert.assertEquals(names.get(1), "Pepsi");

    }


}