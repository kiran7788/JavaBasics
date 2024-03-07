package Sorting;

public class Bbl {
    public static void main(String[] args) {
        int[] array = {32,7,4,55, 22};

        bubbleSort(array);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int itr = 1;
        for (int i = 0; i < n-1; i++) {  
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                itr++;
                System.out.println("No of itr :" + itr);
             }
          }
        
        for (int index = 0; index < arr.length; index++) {
            System.out.print("{"+ arr[index] + "}");
        }
    }
}
