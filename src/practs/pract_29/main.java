package practs.pract_29;

public class main {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        Order order = new InternetOrder();
        order.addItem(new Dish("Borsch", "Soup", 100));
        order.addItem(new Drink("Coca-cola", "Soft drink", 50));

        System.out.println("Order cost: " + order.countCost());
        System.out.println("Order items: " + order.getItems());
        System.out.println("Order names: " + order.getNames());
        System.out.println("Order sorted items: " + order.getSortedItems());

        manager.addOrder("some_address", order);
        manager.addOrder("some_address", order);
        System.out.println(manager.getOrder("some_address"));


        Order order2 = new RestaurantOrder();
        order2.addItem(new Dish("Okroshka", "Soup", 150));
        order2.addItem(new Drink("Sprite", "Soft drink", 50));
        manager.addOrder("1", order2);
        manager.addItemToOrder("1", new Dish("Borsch", "Soup", 100));
        System.out.println(manager.getOrder("1"));
        System.out.println(manager.internetOrdersToList());
        System.out.println(manager.sumOfInternetOrders());
        System.out.println(manager.amountOfItemInInternetOrders("Borsch"));

    }
}
