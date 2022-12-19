package practs.pract_6.task_6;

import java.util.ArrayList;

public class Shop implements Printable{
    private ArrayList<Printable> items;

    public Shop(ArrayList<Printable> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Магазин 'НеЧитай Город' ";
    }

    @Override
    public void print() {
        System.out.println(this);
        for (var printable : items) {
            printable.print();
        }
    }
}
