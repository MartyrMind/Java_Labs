package practs.pract_23.task_1;

public class ArrayQueueADT {
    private int SIZE;
    private Object[] queue;
    private int head, tail;

    //инвариант: head !=  SIZE, tail != SIZE
    ArrayQueueADT(int size) {
        SIZE = size;
        head = -1;
        tail = -1;
        queue = new Object[SIZE];
    }

    //предусловие: очередь не полна (tail < SIZE - 1)
    public static void enqueue(ArrayQueueADT queueADT, Object element) {
        if (isFull(queueADT)) {
            System.out.println("Queue is full");
        } else {
            if (queueADT.head == -1) { //если очередь пуста
                queueADT.head = 0; //указываем на первый элемент
            }
            queueADT.tail = (queueADT.tail + 1) % queueADT.SIZE; //увеличиваем tail
            queueADT.queue[queueADT.tail] = element; //добавляем элемент
        }
    }
    //постусловие: queue[tail] == element

    //предусловие: очередь не пуста (head != tail)
    public static Object element(ArrayQueueADT queueADT) {
        if (isEmpty(queueADT)) {
            System.out.println("Queue is empty");
            return null;
        } else {
            return queueADT.queue[queueADT.head];
        }
    }
    //постусловие: вернет queue[head]

    //предусловие: очередь не пуста (head != tail)
    public static Object dequeue(ArrayQueueADT queueADT) {
        if (isEmpty(queueADT)) {
            System.out.println("Queue is empty");
            return null;
        } else {
            Object element = queueADT.queue[queueADT.head];
            if (queueADT.head == queueADT.tail) { //если в очереди один элемент
                queueADT.head = -1;
                queueADT.tail = -1;
            } else {
                queueADT.head = (queueADT.head + 1) % queueADT.SIZE; //увеличиваем head
            }
            return element;
        }
    }
    //постусловие: вернет queue[head] и увеличит head

    //предусловие: нет, метод можно вызывать в любом случае
    public static int size(ArrayQueueADT queueADT) {
        if (isEmpty(queueADT)) {
            return 0;
        } else {
            return (queueADT.tail - queueADT.head + 1 + queueADT.SIZE) % queueADT.SIZE;
        }
    }
    //постусловие: вернет tail - head

    //предусловие: нет, метод можно вызывать в любом случае
    public static boolean isEmpty(ArrayQueueADT queueADT) {
        return queueADT.head == -1;
    }
    //постусловие: вернет true, если head == -1, иначе false

    //предусловие: нет, метод можно вызывать в любом случае
    public static boolean isFull(ArrayQueueADT queueADT) {
        return (queueADT.head == 0 && queueADT.tail == queueADT.SIZE - 1) || (queueADT.tail == queueADT.head - 1);
    }
    //постусловие: вернет true, если очередь заполнена, иначе false

    //предусловие: нет, метод можно вызывать в любом случае
    public static void clear(ArrayQueueADT queueADT) {
        queueADT.head = -1;
        queueADT.tail = -1;
    }
    //постусловие: очередь пуста (head == tail == -1)

}

