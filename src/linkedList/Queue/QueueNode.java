package linkedList.Queue;

public class QueueNode<Q> {
    Q data;
    QueueNode<Q> next;

    public QueueNode(Q data) {
        this.data = data;
    } 
}