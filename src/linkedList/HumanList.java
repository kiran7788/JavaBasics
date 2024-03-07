package linkedList;

public class HumanList {
    HumanNode head = null, tail = null;
    int size =0;
    public void push (int data) {

        HumanNode hnode = new HumanNode(data);

        if (head==null) {
            head = hnode;
            tail = hnode;
        }
        else{
            tail.setNext(hnode);
            tail = hnode;
        }
        size++;
        
    }
    public void pop() {
        HumanNode cuHumanNode = head;

        if (head == tail) {
            head = null;
            tail = null;
            size = 0;
        }

        if (head != null) {
            while (cuHumanNode != null) {
                if (cuHumanNode.getNext() == tail) {
                    cuHumanNode.setNext(null);
                    tail = cuHumanNode;
                }
                cuHumanNode = cuHumanNode.getNext();
            }
            size--;
        }
    }
    public int getSize() {
        return size;
    }
    public void dsp(HumanNode head) {

        HumanNode current = head;

        if (current != null) {
            System.out.println(current.getData());
            dsp(current.getNext());
        }

        // current = current.getNext();
        
    }
}
