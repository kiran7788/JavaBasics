
public class Loops {
    public static void main(String[] args) {
        int[] array ={5,6,7};
        recursion(array, 0);

    }
    public static int recursion(int[] array , int index) {
        if(index<array.length){
            System.out.println(array[index]);
            recursion(array, ++index);
        }
        return index;

    }

}

