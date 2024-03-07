package arrayList;

// import java.lang.reflect.Array;
// import java.util.ArrayList;
import java.util.*;

public class ArrayListTopic {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(12);
        al.add(34);
        al.add(19);
        al.add(29);
        print(al);
        System.out.println("******************************");
        al.add(1, 45);
        print(al);
        System.out.println("******************************");
        al.remove(3);
        print(al);
        System.out.println("******************************");
        al.clear();
        al.add(11);
        print(al);
        System.out.println("Is empty check: "+al.isEmpty());
        System.out.println("Array list size: "+al.size());
        System.out.println("Find index of 23: "+al.indexOf(21));
        System.out.println("Find index of 12: "+al.indexOf(12));
        System.out.println("Find equals 12: "+al.equals(12));
        System.out.println("Find equals 12: "+al.equals(12));
    
    }

    public static void print(ArrayList<Integer>al) {
        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }
        
    }

    
}
