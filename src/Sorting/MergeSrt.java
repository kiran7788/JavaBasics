package Sorting;

public class MergeSrt {
    public static void main(String[] args) {
    int arr[]={2,6,8,9,11};
    int j=0;
    int start=0;
    int end=arr.length-1;
    int middle=0;
    msort(arr, j, start, end, middle);
    }
    public static int msort(int [] arr, int j, int start, int end, int middle) {
        if (start<end) {
             middle = (start+end) / 2;

             int [] rFinal=msort(arr, j, start, end, middle+1);
             int [] lFinal=msort(arr, j, start, end, middle);


              if (j == arr[middle]) {
                
                return middle;
            } 
            else if (j > arr[middle]) {
                 end = middle + 1;
                } 
                else {
                    start = middle - 1;
                   }
        }
        System.out.println(middle);
        return arr;
    }
    
}
                     