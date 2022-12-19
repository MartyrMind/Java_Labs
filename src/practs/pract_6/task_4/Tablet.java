package practs.pract_6.task_4;

public class Tablet implements Priceable{
    private int price;

    public Tablet(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
