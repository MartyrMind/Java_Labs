package practs.pract_29;

import java.util.*;

class ItemNode {
    public Item item;
    public ItemNode next;
    public ItemNode prev;

    public ItemNode(Item item) {
        this.item = item;
        next = null;
        prev = null;
    }
}

public class InternetOrder implements Order{ //сущность, описывающая конкретный заказ, сделанный через интернет
    ItemNode head;

    public InternetOrder() {
        this.head = new ItemNode(new Drink("head", "root_node", 0));
    }

    public InternetOrder(List<Item> items) {
        for(var item:items) addItem(item);
    }

    @Override
    public boolean addItem(Item item) {
        ItemNode itr = head;
        while(itr.next != null) itr = itr.next; //дошли до конца списка
        ItemNode newNode = new ItemNode(item); //создали новую ноду

        newNode.prev = itr; //связали ноды
        itr.next = newNode;

        return true; //вернули логический признак успеха
    }

    @Override
    public boolean removeItem(String name) {
        ItemNode itr = head.next;
        while (itr != null) {
            if (name.equals(itr.item.name())) { //совпало название - удаляем
                itr.prev.next = itr.next; //связали ноды
                itr.next.prev = itr.prev;
                itr = null; //удалили
                return true;
            }
            itr = itr.next;
        }
        return false;
    }

    @Override
    public int removeAll(String name) {
        ItemNode itr = head.next;
        int count = 0;
        while(itr != null) {
            if (name.equals(itr.item.name())) {
                itr.prev.next = itr.next;
                itr.next.prev = itr.prev;
                itr = null;
                count++;
            }
        }
        return count;
    }

    @Override
    public int countItems() {
        ItemNode itr = head.next;
        int count = 0;
        while(itr != null) {
            itr = itr.next;
            count++;
        }
        return count;
    }

    @Override
    public int countItems(String name) {
        ItemNode itr = head.next;
        int count = 0;
        while(itr != null) {
            if (itr.item.name().equals(name)) count++;
            itr = itr.next;
        }
        return count;
    }

    @Override
    public List<Item> getItems() {
        ArrayList<Item> items = new ArrayList<>();
        ItemNode itr = head.next;
        while (itr != null) {
            items.add(itr.item);
            itr = itr.next;
        }
        return items;
    }

    @Override
    public List<Item> getSortedItems() {
        ArrayList<Item> items = (ArrayList<Item>) getItems();
        Collections.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                if (o1.cost() > o2.cost()) return 1;
                if (o1.cost() < o2.cost()) return -1;
                else return 0;
            }
        });

        return items;
    }

    @Override
    public double countCost() {
        double cost = 0;
        ItemNode itr = head.next;
        while(itr != null) {
            cost += itr.item.cost();
            itr = itr.next;
        }
        return cost;
    }

    @Override
    public List<String> getNames() {
        Set<String> names = new HashSet<>();
        ItemNode itr = head.next;
        while(itr != null) {
            names.add(itr.item.name());
            itr = itr.next;
        }
        return new ArrayList<>(names);
    }
}
