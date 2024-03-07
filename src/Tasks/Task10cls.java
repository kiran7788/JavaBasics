package Tasks;

import java.util.ArrayList;

public class Task10cls {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        Task10<Integer> find = new Task10<>(arr);

        ArrayList<ArrayList<Integer>> resultArr =  find.FindOddrEv(arr);
        ArrayList<Integer> oddArr =  find.returnOdd(resultArr);
        ArrayList<Integer> EvenArr =  find.returnEven(resultArr);

        System.out.print("odd and even numbers: ");
        for (ArrayList<Integer> arrNum : resultArr) {
            System.out.print(arrNum + " ");
        }

        System.out.println();

        System.out.print("even numbers: ");
        for (Integer i : EvenArr) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("odd numbers: ");
        for (Integer i : oddArr) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("from re-useable function");
        System.out.println("odd numbers");
        find.print(find.oddArray());
        System.out.println("even numbers");
        find.print(find.evenArray());
    }
}
