package Tasks;

public class Task11 { 
    public static void main(String[] args) {
        int n=18;
        int mid =n/2;
        System.out.println(tsk(n, mid));
    }
        
        public static int tsk(int n, int mid) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=n/2;j++){

                if((i==mid/2)||i==j||i+j==mid-1){
                    System.out.print("* ");
                }
                // else if((i==0&&j==0||i==1&&j==1||i==2&&j==2||i==3&&j==3)){
                //     System.out.print("* ");
                // }
                // else if((i==5&&j==3||i==6&&j==2||i==7&&j==1||i==8&&j==0)){
                //     System.out.print("* ");
                // }
                // else if((i==5&&j==5||i==6&&j==6||i==7&&j==7||i==8&&j==8)){
                //     System.out.print("* ");
                // }
                else if ((j==n/4)) {
                    
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