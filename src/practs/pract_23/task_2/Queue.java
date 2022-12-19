package practs.pract_23.task_2;

public interface Queue {
    //контракт
    //инвариант класса: head !=  SIZE, tail != SIZE

    //предусловие: очередь не полна (tail < SIZE - 1)
    void enqueue(Object element);
    //постусловие: queue[tail] == element, tail++


    //предусловие: очередь не пуста (head != tail)
    Object element();
    //постусловие: вернет queue[head]

    //предусловие: очередь не пуста (head != tail)
    Object dequeue();
    //постусловие: вернет queue[head] и увеличит head

    //предусловие: нет, метод можно вызывать в любом случае
    int size();
    //постусловие: вернет размер очереди

    //предусловие: нет, метод можно вызывать в любом случае
    boolean isEmpty();
    //постусловие: вернет true, если очередь пуста, иначе false

}
