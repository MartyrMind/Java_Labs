package practs.pract_23.task_2;

public abstract class AbstractQeue implements Queue {

    protected int size = 0;

    protected abstract Object enqueueReal(Object element);
    protected abstract Object dequeueReal();
    protected abstract Object elementReal();


    @Override
    public void enqueue(Object element) {
        Object res = enqueueReal(element);
        if (res != null) {
            size++;
        } else {
            System.out.println("Queue is full. Operation failed");
        }
    }

    @Override
    public Object element() {
        Object res = elementReal();
        return res == null ? "Queue is empty" : res;
    }

    @Override
    public Object dequeue() {
        Object res = dequeueReal();
        if (res != null) {
            size--;
        }
        return res == null ? "Queue is empty" : res;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
