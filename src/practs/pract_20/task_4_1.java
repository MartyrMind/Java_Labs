package practs.pract_20;

import java.util.ArrayList;
import java.util.Scanner;

public class task_4_1 <E extends Number>{
    private ArrayList<E> list;
    public task_4_1(ArrayList<E> list) {
        this.list = list;
    }


    public E getMin() {
        E min = list.get(0);
        for (E e : list) {
            if (e.doubleValue() < min.doubleValue()) {
                min = e;
            }
        }
        return min;
    }

    public E getMax() {
        E max = list.get(0);
        for (E e : list) {
            if (e.doubleValue() > max.doubleValue()) {
                max = e;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //тестируем на Integer
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        task_4_1<Integer> t = new task_4_1<>(list);
        System.out.println("Min: " + t.getMin());
        System.out.println("Max: " + t.getMax());

        //тестируем на Double
        ArrayList<Double> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list2.add(in.nextDouble());
        }
        task_4_1<Double> t2 = new task_4_1<>(list2);
        System.out.println("Min: " + t2.getMin());
        System.out.println("Max: " + t2.getMax());
    }
}
