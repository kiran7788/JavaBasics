package Tasks;

public class Tsk2 { 
    public static void main(String[] args) {
        int n=5;
        System.out.println(tsk(n));
    }
        
        public static int tsk(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if((i==n-1)||(j==0)){
                    System.out.print("* ");
                }
                else if ((i==3)&&(j==1)||(i==2)&&(j==2)) {
                    
                    System.out.print("* ");
                    
                }
                else if ((i==0)&&(j==4)||(i==1)&&(j==3)) {
                    
                    System.out.print("* ");
                    
                }
                else{
                System.out.print("  ");
                }
            }System.out.println();
        }
        return n;
    }
}