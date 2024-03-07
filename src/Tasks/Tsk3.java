package Tasks;

public class Tsk3 { 
    public static void main(String[] args) {
        int n=5;
        int j=0;
        int i=0;
        tsk(n, i, j);
    }
        
        public static int tsk(int n, int j, int i) {
        if(i<n){
            if(j<n){

                if((i==0)||(j==0)){
                    System.out.print("$ ");
                }
                else if ((i==n-1)||(j==n-1)) {
                    
                    System.out.print("$ ");
                    
                }
                else{
                System.out.print("  ");
                 return tsk(n, j+1, i);
                }
            }System.out.println();
        return tsk(n, j=0, i+1);
        }
        return i;
    }
}