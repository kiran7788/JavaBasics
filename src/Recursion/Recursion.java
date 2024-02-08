package Recursion;

public class Recursion    {

    public static void main(String[] args) {
        int[] array ={5,6,7};
    recursion(array, array.length);

}
public static int recursion(int[] array , int index) {
    if(index >= 0){
        System.out.println(index);
        
        recursion(array, index-1);
    }
    return index;
    
}
}

