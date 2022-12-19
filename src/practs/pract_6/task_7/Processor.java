package practs.pract_6.task_7;

public class Processor {
    int cost;
    int speed;

    public Processor(int cost, int speed) {
        this.cost = cost;
        this.speed = speed;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "cost=" + cost +
                ", speed=" + speed +
                '}';
    }
}
