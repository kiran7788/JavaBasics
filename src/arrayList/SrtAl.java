package arrayList;

import java.util.ArrayList;

public class SrtAl {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(11);
        array.add(21);
        array.add(20);
        array.add(16);
        array.add(9);
        bubbleSort(array);
    }

    public static void bubbleSort(ArrayList<Integer> array) {
        int n = array.size();
        int itr = 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array.get(j) > array.get(j + 1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j+1, temp);
                }

            }
        }

        for (int index = 0; index < array.size(); index++) {
            System.out.println(array.get(index));
        }
    }
}
