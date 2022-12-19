package practs.pract_23.task_2;

public class ArrayQueue extends AbstractQeue {
    private Object[] queue;
    private int head;
    private int tail;
    private int SIZE;

    public ArrayQueue(int size) {
        this.SIZE = size;
        queue = new Object[SIZE];
        head = -1;
        tail = -1;
    }

    @Override
    protected Object enqueueReal(Object element) {
        if ((head == 0 && tail == SIZE - 1) || (tail == head - 1)) {
            return null;
        } else {
            if (head == -1) { //если очередь пуста
                head = 0; //указываем на первый элемент
            }
            tail = (tail + 1) % SIZE; //увеличиваем tail
            queue[tail] = element; //добавляем элемент
            return element;
        }
    }

    @Override
    protected Object dequeueReal() {
        if (isEmpty()) {
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

    @Override
    protected Object elementReal() {
        if (isEmpty()) {
            return null;
        } else {
            return queue[head];
        }
    }
}
