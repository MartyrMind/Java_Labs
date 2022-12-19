package practs.pract_23.task_2;

public class Tester {
    public static void main(String[] args) {
        Queue linkedQueue = new LinkedQueue();
        Queue arrayQueue = new ArrayQueue(5);

        System.out.println("LinkedQueue");
        System.out.println("--------------------");
        System.out.println("del first elem: " + linkedQueue.dequeue());
        System.out.println("Insert 5 elements");
        for(int i = 0; i < 5; i++) {
            linkedQueue.enqueue(i);
        }
        System.out.println("is empty: " + linkedQueue.isEmpty());
        System.out.println("del first elem: " + linkedQueue.dequeue());
        System.out.println("first elem: " + linkedQueue.element());
        System.out.println("size: " + linkedQueue.size());
        System.out.println();

        System.out.println("ArrayQueue");
        System.out.println("--------------------");
        System.out.println("del first elem: " + arrayQueue.dequeue());
        System.out.println("Insert 5 elements");
        for(int i = 0; i < 5; i++) {
            arrayQueue.enqueue(i);
        }
        System.out.print("insert elem 1: ");
        arrayQueue.enqueue(1);

        System.out.println("del first elem: " + arrayQueue.dequeue());
        System.out.println("first elem: " + arrayQueue.element());
        System.out.println("size: " + arrayQueue.size());
        System.out.println("del 5 elems");
        for(int i = 0; i < 5; i++) {
            System.out.print(arrayQueue.dequeue() + " ");
        }
        System.out.println();
        System.out.println("is empty: " + arrayQueue.isEmpty());
    }
}
