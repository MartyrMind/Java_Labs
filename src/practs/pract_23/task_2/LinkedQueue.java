package practs.pract_23.task_2;

public class LinkedQueue extends AbstractQeue {
    private class Node {
        Object value;
        Node next;
        Node prev;

        public Node(Object value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node head;
    private Node tail;
    @Override
    protected Object enqueueReal(Object element) {
        tail = new Node(element, null, tail);
        if (head == null) {
            head = tail;
        } else {
            tail.prev.next = tail;
        }

        return element;
    }

    @Override
    protected Object dequeueReal() {
        if (head == null) return null;
        Object res = head.value;
        head = head.next;
        head.prev = null;
        return res;
    }

    @Override
    protected Object elementReal() {
        return head == null ? null : head.value;
    }
}
