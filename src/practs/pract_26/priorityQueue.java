package practs.pract_26;

import java.util.ArrayList;

public class priorityQueue {
    private ArrayList<Integer> queue;
    private int capacity;
    private int size;

    public priorityQueue(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        queue = new ArrayList<>();
    }

    public void add(Integer num) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        queue.add(num);
        size++;
    }

    public Integer remove() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < size; i++) {
            if (queue.get(i) > max) {
                max = queue.get(i);
                maxIndex = i;
            }
        }
        queue.remove(maxIndex);
        size--;
        return max;
    }

    public static void main(String[] args) {
        priorityQueue queue = new priorityQueue(5);
        queue.add(6);
        queue.add(1);
        queue.add(4);
        queue.add(2);
        queue.add(5);
        queue.add(3);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
