package linkedList.Queue;

public class QueueLogic<Q> {
    QueueNode<Q> head = null, tail = null;
    int count = 0;

    public int getCount() {
        return count;
    }

    public void enqueue(Q data) {
        QueueNode<Q> newQueue = new QueueNode<Q>(data);

        if (head == null) {
            head = newQueue;
            tail = newQueue;
        } else {
            tail.next = newQueue;
            tail = newQueue;
        }

        count++;
    }

    public void dequeue() {
        if (head != null) {
            head = head.next;
            count--;
        }
    }

    void display() {
        QueueNode<Q> current = head;

        if (head != null) {
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }

        System.out.println("size: " + getCount());
    }
}