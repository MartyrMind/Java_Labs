package practs.pract_21;

import java.util.Scanner;

public class task_1 <E> {
    private E[] array;

    public task_1(E[] array) {
        this.array = array;
    }

    public E[] getArray() {
        return array;
    }

    public void setArray(E[] array) {
        this.array = array;
    }

    public void printArray() {
        for (E e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public E get(int index) {
        try {
            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
            return null;
        }
    }

    public int length() {
        return array.length;
    }


    public static void main(String[] args) {
        String [] s = {"a", "b", "c", "d", "e"};
        Integer [] i = {1, 2, 3, 4, 5};
        Double [] d = {1.1, 2.2, 3.3, 4.4, 5.5};

        task_1<String> stringArray = new task_1<>(s);
        task_1<Integer> intArray = new task_1<>(i);
        task_1<Double> doubleArray = new task_1<>(d);

        stringArray.printArray();
        intArray.printArray();
        doubleArray.printArray();

        System.out.println(stringArray.get(2));
        System.out.println(intArray.get(2));
        System.out.println(doubleArray.get(8));

    }
}
