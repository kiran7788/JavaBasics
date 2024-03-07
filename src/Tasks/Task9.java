package Tasks;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int g1 = scanner.nextInt(); 
        int g2 = scanner.nextInt(); 
        int gcf = GcfVal(g1, g2);
        int sum = Math.divideExact(g1, gcf);
        int sum1 = Math.divideExact(g2, gcf);

        System.out.println(sum + ":"+ sum1);
        System.out.println(gcf);
    }
    public static int GcfVal(int a, int b) { 
        a = Math.abs(a);
        b = Math.abs(b);
       
        while (b != 0){
            int temp = b;
            b=a%b;
            a = temp;
        }return a;

    }   
}
