package practs.pract_6.task_4;

public class Computer implements Priceable {
    private int price;

    public Computer(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
