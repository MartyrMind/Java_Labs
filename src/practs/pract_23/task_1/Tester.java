package practs.pract_23.task_1;

public class Tester {
    public static void main(String[] args) {

        System.out.println("ArrayQueueModule");
        System.out.println("________________");
        for(int i = 0; i < 10; i++) {
            ArrayQueueModule.enqueue(i);
        }
        System.out.println("first elem: " + ArrayQueueModule.element());
        System.out.println("return and del first elem: " + ArrayQueueModule.dequeue());
        System.out.println("first elem: " + ArrayQueueModule.element());
        System.out.println("queue size: " + ArrayQueueModule.size());
        System.out.println("is empty: " + ArrayQueueModule.isEmpty());
        System.out.println("is full: " + ArrayQueueModule.isFull());
        System.out.println("try to del 10 elems:");
        System.out.println("++++++++++++++++++++");
        for(int i = 0; i < 10; i++) {
            System.out.println(ArrayQueueModule.dequeue());
        }
        System.out.println("++++++++++++++++++++");
        System.out.println("is empty: " + ArrayQueueModule.isEmpty());
        System.out.println("is full: " + ArrayQueueModule.isFull());
        System.out.println("________________");

        System.out.println("ArrayQueueModule");
        System.out.println("________________");
        ArrayQueueADT queueADT = new ArrayQueueADT(10);
        for(int i = 0; i < 10; i++) {
            ArrayQueueADT.enqueue(queueADT, i);
        }
        System.out.println("first elem: " + ArrayQueueADT.element(queueADT));
        System.out.println("return and del first elem: " + ArrayQueueADT.dequeue(queueADT));
        System.out.println("first elem: " + ArrayQueueADT.element(queueADT));
        System.out.println("queue size: " + ArrayQueueADT.size(queueADT));
        System.out.println("is empty: " + ArrayQueueADT.isEmpty(queueADT));
        System.out.println("is full: " + ArrayQueueADT.isFull(queueADT));
        System.out.println("clear queue");
        ArrayQueueADT.clear(queueADT);
        System.out.println("is empty: " + ArrayQueueModule.isEmpty());
        System.out.println("try to del elem: " + ArrayQueueADT.dequeue(queueADT));
        System.out.println("________________");

        System.out.println("ArrayQueue");
        System.out.println("________________");
        ArrayQueue queue = new ArrayQueue(10);
        for(int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        System.out.println("first elem: " + queue.element());
        System.out.println("return and del first elem: " + queue.dequeue());
        System.out.println("first elem: " + queue.element());
        System.out.println("queue size: " + queue.size());
        System.out.println("clear queue");
        queue.clear();
        System.out.println("is empty: " + queue.isEmpty());
        System.out.println("try to del elem: " + queue.dequeue());
        System.out.println("insert elem (1)");
        queue.enqueue(1);
        System.out.println("first elem: " + queue.element());
        System.out.println("________________");
    }
}
