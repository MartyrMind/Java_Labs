package practs.pract_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class task_5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        //fill lists
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        //shuffle lists
        Collections.shuffle(arrayList);
        Collections.shuffle(linkedList);

        int position = (int) (Math.random() * 1000000) + 1;
        int val = (int)(Math.random() * 1000000) + 1;

        System.out.println("========================================");
        System.out.println("Insertion time testing:");
        System.out.println("Inserting " + val + " at position " + position + " in ArrayList: ");
        long start = System.nanoTime();
        arrayList.add(position, 0);
        long end = System.nanoTime();
        System.out.println("ArrayList: " + (end - start) / 1000000 + " ms");
        System.out.println("Inserting " + val + " at position " + position + " in LinkedList: ");
        start = System.nanoTime();
        linkedList.add(position, 0);
        end = System.nanoTime();
        System.out.println("LinkedList: " + (end - start) / 1000000 + " ms");
        System.out.println("========================================");
        position = (int) (Math.random() * 1000000) + 1;
        System.out.println("Deletion time testing:");
        System.out.println("Deleting element at position " + position + " in ArrayList: ");
        start = System.nanoTime();
        arrayList.remove(position);
        end = System.nanoTime();
        System.out.println("ArrayList: " + (end - start) / 1000000 + " ms");
        System.out.println("Deleting element at position " + position + " in LinkedList: ");
        start = System.nanoTime();
        linkedList.remove(position);
        end = System.nanoTime();
        System.out.println("LinkedList: " + (end - start) + " ns");
        System.out.println("========================================");
        val = (int)(Math.random() * 1000000) + 1;
        System.out.println("Searching time testing:");
        System.out.println("Searching for " + val + " in ArrayList: ");
        start = System.nanoTime();
        arrayList.indexOf(val);
        end = System.nanoTime();
        System.out.println("ArrayList: " + (end - start) / 1000000 + " ms");
        System.out.println("Searching for " + val + " in LinkedList: ");
        start = System.nanoTime();
        linkedList.indexOf(val);
        end = System.nanoTime();
        System.out.println("LinkedList: " + (end - start) / 1000000 + " ms");
        System.out.println("========================================");
    }
}
