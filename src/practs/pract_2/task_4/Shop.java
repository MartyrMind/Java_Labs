package practs.pract_2.task_4;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private ArrayList<Computer> computers = new ArrayList<>();

    @Override
    public String toString() {
        return "Shop{" +
                "computers=" + computers +
                '}';
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void remComputer(Computer computer) {
        computers.remove(computer);
    }

    public Computer findByName(String name) {
        return computers.stream()
                .filter(findEmp -> name.equals(findEmp.getName())).findAny().orElse(null);
    }


}
