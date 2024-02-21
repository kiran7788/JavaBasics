package Search;

public class Ternary {
    public static int main(String[] args) {
        int arr[] = {2,4,5,6,8,9};
        int i=0;
        int start = 0;
        int end = arr.length-i;
        int loopExecution=0;
        
        while (start<=end);{
            int mid1 =(end + start)/3;
            int mid2 =(end + start)/3;
            
            if (arr[mid1]==n){
                System.out.println(loopExecution);
                return mid1;
            
            }

            else if (arr[mid1]>n) {
                end=mid1-1;
                
            }

            else if (arr[mid2]<n){
                start =mid2+1;
            }
            else{
                start = mid1+1;
                start = mid2-1;
            }
            
        }
        System.out.println(loopExecution);
        return-1;
        }
        
    
}

