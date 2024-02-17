package Search;
import java.util.*;

public class Lin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int arr[] = {7,8,12,13,9,2,4};
       int n=scanner.nextInt();
       int res = -1;
       for(int i=0; i<arr.length; i++){
        if(arr[i]==n){
            res=i;
            break;
        }
       }
       System.out.println(res);
    }
    
}
