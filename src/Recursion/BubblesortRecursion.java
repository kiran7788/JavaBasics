package Recursion;

public class BubblesortRecursion {
    public static void main(String[] args) {
        int[] arr = {2,5,8,7,4,1};
    }
    public static int bubblesort(int index, int[] arr) {
        if(index<arr.length){
            if(arr[index]> arr[index+1]){
                int temp =arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = temp;
            }
        }
    }
}
    return 1;
}
}