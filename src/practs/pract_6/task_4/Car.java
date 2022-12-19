package practs.pract_6.task_4;

public class Car implements Priceable{
    private int price;

    public Car(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
