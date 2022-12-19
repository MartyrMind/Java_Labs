package practs.pract_29;

import java.util.*;

public class RestaurantOrder implements Order{ //сущность, описывающая заказ, сделанный в ресторане
    ArrayList<Item> items;

    public RestaurantOrder() {
        items = new ArrayList<>();
    }

    public RestaurantOrder( ArrayList<Item> items) {
        this.items = items;
    }

    @Override
    public boolean addItem(Item item) {
        return items.add(item);
    }

    @Override
    public boolean removeItem(String name) {
        for(var item:items) {
            if (name.equals(item.name())) {
                items.remove(item);
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String name) {
        int count = 0;
        for(var item:items) {
            if (name.equals(item.name())) {
                items.remove(item);
                count++;
            }
        }
        return count;
    }

    @Override
    public int countItems() {
        return items.size();
    }

    @Override
    public int countItems(String name) {
        int count = 0;
        for(var item:items) {
            if (name.equals(item.name())) count++;
        }
        return count;
    }

    @Override
    public List<Item> getItems() {
        return items;
    }

    @Override
    public List<Item> getSortedItems() {
        //отсортировать по убыванию цены
        items.sort((o1, o2) -> (int) (o2.cost() - o1.cost()));
        return items;
    }

    @Override
    public double countCost() {
        double cost = 0;
        for(var item:items) cost += item.cost();
        return cost;
    }

    @Override
    public List<String> getNames() {
        Set<String> names = new HashSet<>();
        for(var item:items) names.add(item.name());
        return new ArrayList<>(names);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestaurantOrder that = (RestaurantOrder) o;
        return Objects.deepEquals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }
}
