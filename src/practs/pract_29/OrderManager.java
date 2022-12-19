package practs.pract_29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class OrderManager {
    HashMap<String, Order> map = new HashMap<>();
    ArrayList<String> tableList = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"));

    public void addOrder(String address, Order order) {
        try {
            if (map.containsKey(address)) throw new OrderAlreadyAddedException("Order already added");
            if (order instanceof RestaurantOrder) {
                if (!tableList.contains(address)) throw new IllegalTableNumber("Illegal table number");
            }
            map.put(address, order);
        } catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }
    }

    public Order getOrder(String address) {
            if (!map.containsKey(address)) System.out.println("Order not found");
            else return map.get(address);
            return null;
    }

    public void removeOrder(String address) {
        if (!map.containsKey(address)) System.out.println("Order not found");
        else map.remove(address);
    }

    public void addItemToOrder(String address, Item item) {
        if (!map.containsKey(address)) System.out.println("Order not found");
        else map.get(address).addItem(item);
    }

    public ArrayList<InternetOrder> internetOrdersToList() {
        ArrayList<InternetOrder> list = new ArrayList<>();
        for (var order:map.entrySet()) {
            if (order.getValue() instanceof InternetOrder) {
                list.add((InternetOrder) order.getValue());
            }
        }
        return list;
    }

    public double sumOfInternetOrders() {
        double sum = 0;
        for (var order:map.entrySet()) {
            if (order.getValue() instanceof InternetOrder) {
                sum += order.getValue().countCost();
            }
        }
        return sum;
    }

    public int amountOfItemInInternetOrders(String name) {
        int count = 0;
        for (var order:map.entrySet()) {
            if (order.getValue() instanceof InternetOrder) {
                count += order.getValue().countItems(name);
            }
        }
        return count;
    }
}
