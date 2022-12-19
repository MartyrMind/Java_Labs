package practs.pract_6.task_7;

public class Monitor {
    int cost;
    int frequency;

    public Monitor(int cost, int frequency) {
        this.cost = cost;
        this.frequency = frequency;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "cost=" + cost +
                ", frequency=" + frequency +
                '}';
    }
}
