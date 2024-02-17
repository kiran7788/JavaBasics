package Recursion;

public class Duplicate {
    public static void main(String[] args) {
         int [] arr = {6,5,8,4,1,9,7,3};
         findDuplicate(arr,0,1);
    }
    public static void duplicate (int [] arr, int i, int j) {
        if(j<arr.length-1)
        j=i+1;
    }
        else
        {
            i=i+1;
            j=j+1;
        }
        System.out.println("Function call i:"+i+"j:"+j);
        if(i<arr.length-1)
        {
            if(arr[i]==arr[j])
            {
                System.out.println("Duplicate:" arr[i]);
            }
            duplicate(arr, i, j);
        }
    }
    System.out.println(arr[i]);

}