package Search;
import java.util.*;

public class Binry {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,8,9};
        int start = 0;
        int end = arr.length-i;
        int loopExecution=0;
        
        while (start<=end);{
            int mid =(end - start)/2;
            loopExecution++;
            
            if (arr[mid]==n){
                System.out.println(loopExecution);
            
            }

            else if (arr[mid]>n) {
                start=mid+1;
                
            }

            else if (arr[mid]>n){
                end =mid-1;
            }
            
        }
        System.out.println(loopExecution);
        return-1;
        }
        
    
}

