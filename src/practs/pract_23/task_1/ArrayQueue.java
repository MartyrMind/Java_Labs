package practs.pract_23.task_1;

public class ArrayQueue {
    private int SIZE;
    private Object[] queue;
    private int head, tail;

    //инвариант: head !=  SIZE, tail != SIZE
    public ArrayQueue(int SIZE) {
        this.SIZE = SIZE;
        head = -1;
        tail = -1;
        queue = new Object[SIZE];
    }

    //предусловие: очередь не полна (tail < SIZE - 1)
    public void enqueue(Object element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (head == -1) { //если очередь пуста
                head = 0; //указываем на первый элемент
            }
            tail = (tail + 1) % SIZE; //увеличиваем tail
            queue[tail] = element; //добавляем элемент
        }
    }
    //постусловие: queue[tail] == element

    //предусловие: очередь не пуста (head != tail)
    public Object element() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            return queue[head];
        }
    }
    //постусловие: вернет queue[head]

    //предусловие: очередь не пуста (head != tail)
    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            Object element = queue[head];
            if (head == tail) { //если в очереди один элемент
                head = -1;
                tail = -1;
            } else {
                head = (head + 1) % SIZE; //увеличиваем head
            }
            return element;
        }
    }
    //постусловие: вернет queue[head] и увеличит head

    //предусловие: нет, метод можно вызывать в любом случае
    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            return (tail - head + 1 + SIZE) % SIZE;
        }
    }
    //постусловие: вернет tail - head

    //предусловие: нет, метод можно вызывать в любом случае
    public boolean isEmpty() {
        return head == -1;
    }
    //постусловие: вернет true, если head == -1, иначе false

    //предусловие: нет, метод можно вызывать в любом случае
    public boolean isFull() {
        return (head == 0 && tail == SIZE - 1) || (tail == head - 1);
    }
    //постусловие: вернет true, если очередь заполнена, иначе false

    //предусловие: нет, метод можно вызывать в любом случае
    public void clear() {
        head = -1;
        tail = -1;
    }
    //постусловие: очередь пуста (head == tail == -1)

}

