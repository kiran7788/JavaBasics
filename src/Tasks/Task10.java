package Tasks;

import java.util.ArrayList;

public class Task10<T> {
    public ArrayList<ArrayList<Integer>> FindOddrEv(ArrayList<Integer> arr) {
        ArrayList<Integer> oddArr = new ArrayList<>();
        ArrayList<Integer> evenArr = new ArrayList<>();

        for (Integer i : arr) {
            if (i % 2 == 0) {
                evenArr.add(i);
            } else {
                oddArr.add(i);
            }
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(evenArr);
        result.add(oddArr);

        return result;
    }

    public ArrayList<Integer> returnOdd(ArrayList<ArrayList<Integer>> result) {
        ArrayList<Integer> oddArr = result.get(1); 
        return oddArr;
    }

    public ArrayList<Integer> returnEven(ArrayList<ArrayList<Integer>> result) {
        ArrayList<Integer> EvenArr = result.get(0); 
        return EvenArr;
    }

    ArrayList<T> array;

    public Task10(ArrayList<T> arr) {
        array = arr;
    }

    public ArrayList<Integer> oddArray() {
        return oddAndEven(true);
    }

    public ArrayList<Integer> evenArray() {
        return oddAndEven(false);
    }

    public ArrayList<Integer> oddAndEven(Boolean isOdd) {
        ArrayList<Integer> res = new ArrayList<>();

        for (T element : array) {
            if (element instanceof Integer) {
                Integer val = (Integer) element;
                if ((val % 2 != 0 && isOdd) || (val % 2 == 0 && !isOdd)) {
                    res.add(val);
                }
            }
        }

        return res;
    }

    public void print(ArrayList<T> arr) {
        for (T element : arr) {
            System.out.println(element);
        }
    }
}
