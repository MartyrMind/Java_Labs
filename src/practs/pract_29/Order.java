package practs.pract_29;

import java.util.List;

public interface Order {
    abstract boolean addItem(Item item);
    abstract boolean removeItem(String name);
    abstract int removeAll(String name);
    abstract int countItems();
    abstract int countItems(String name);
    abstract List<Item> getItems();
    abstract List<Item> getSortedItems();
    abstract double countCost();
    abstract List<String> getNames();

}
