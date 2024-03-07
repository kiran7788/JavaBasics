package Tasks;

public class Tsk4 { 
    public static void main(String[] args) {
        int w=8, h=24;
        int jumpWidth =h-3;
        int jumpMidth = jumpWidth/2;
        if(h%2==1){
            int midH=(h/2);
            int jumpLeft = 0, jumpRight=jumpWidth;

        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                int printLocation=j%jumpWidth;

                if(midH==i){
                    System.out.print("* ");
                }
                else if (printLocation == jumpLeft || printLocation == jumpRight) {
                    
                    System.out.print("* ");
                }       
                
                else if((i==0)|| j==0 || i==h-1 || j==w-1){
                System.out.print("  ");
                }
                else if ((i==1)&&(j==3)||(j==5)&&(i==1)) {
                    
                    System.out.print("* ");
                    
                }
                else if ((i==1)&&(j==3)||(j==5)&&(i==1)) {
                    
                    System.out.print("* ");
                    
                }
                else if ((j==1)&&(i==1)) {
                    
                    System.out.print("* ");
                    
                }
            }
            System.out.println("  ");
            if(jumpMid>(i%h)&& (midH-1) !=i)
                {
                jumpLeft++;
                jumpRight++;
            }
            else if(midH != i && (midH-1) !=i){
            System.out.print("  ");
            jumpLeft++;
            jumpRight++;
                }
            }System.out.println();
        }
    }
    
}
