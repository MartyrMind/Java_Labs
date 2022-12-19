package practs.pract_30;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface OrdersManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    ArrayList<Order> getOrders();
    int ordersCostSummary();
    int ordersQuantity();
}
