package Tasks;

public class Task7 {
    public static void main(String[] args) {
        String s= "Hello world";

        System.out.println("Replace : "+s.replace("world", "All"));
        System.out.println("Replace : "+s.replace(" ", "_ _ _"));
         String [] sArr= s.split(" ");
         String [] symbol= s.split("");

         for (int i=sArr.length-1;i>=0;i--){
            System.out.print(sArr[i]+" ");
        }System.out.println();
         
        System.out.print("Split symbol : ");
        symb(symbol);
    }

    public static void symb(String[] sArr) {
        for (int i = 0; i < sArr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(sArr[i] + "_");
            } else {
                System.out.print(sArr[i] + "*");
            }
        }
    }

    
}
