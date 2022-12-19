package practs.pract_6.task_7;

import java.util.ArrayList;
import java.util.Objects;

public class Shop {
    private ArrayList<Computer> computers;

    public Shop(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    public void add(Computer computer) {
        computers.add(computer);
    }

    public void del(String name, int cost) {
        Computer candidate = search(name, cost);
        if (candidate != null) computers.remove(candidate);
        else System.out.println("Not found");
    }

    public Computer search(String name, int cost) {
        for (Computer computer : computers) {
            if (Objects.equals(computer.getModel().title, name) && computer.getCost() == cost) return  computer;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "computers=" + computers +
                '}';
    }
}
