package practs.pract_6.task_7;

public class Memory {
    int cost;
    int capacity;

    public Memory(int cost, int capacity) {
        this.cost = cost;
        this.capacity = capacity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "cost=" + cost +
                ", capacity=" + capacity +
                '}';
    }
}
