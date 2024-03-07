package Tasks;

public class Tsk2 { 
    public static void main(String[] args) {
        int n=516;
        int i=0;
        int j=0;
        tsk(n,i,j);
    }
        
        public static int tsk(int n, int i,int j) {
        if(i<n){
            if(j<n){

                if((i==n-1)||(j==0)){
                    System.out.print("% ");
                }
                else if ((i==3)&&(j==1)||(i==2)&&(j==2)) {
                    
                    System.out.print("% ");
                    
                }
                else if ((i==0)&&(j==4)||(i==1)&&(j==3)) {
                    
                    System.out.print("% ");
                    
                }
                else{
                System.out.print("  ");
            }
            return tsk(n, i, j+1);
            }
            System.out.println();
            return tsk(n, i+1, 0);
        }
        return n;
    }
}