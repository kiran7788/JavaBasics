package linkedList;

public class Hstack {
    public static void main(String[] args) {
        HumanList list = new HumanList();

        System.out.println("Before pop");
        list.push(10);
        list.push(18);
        list.push(12);
        list.dsp(list.head);
        System.out.println("Size : "+ list.getSize());
        System.out.println("After pop");
        list.pop();
        list.pop();
        list.pop();
        list.pop();
        list.pop();
        list.dsp(list.head);
        System.out.println("Size : "+ list.getSize());

    }
    
}
