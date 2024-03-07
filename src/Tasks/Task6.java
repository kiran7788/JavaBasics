package Tasks;

public class Task6 {
    public static void main(String[] args) {
        String str = "Hello world All";
        String str1 = "Hello world";
        logic(str);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        logic(str1);

    }

    public static void logic(String s) {
        String[] sArr= s.split(" ");

        for(int i=0; i<sArr.length;i++){
            
            for(int j=0; j<sArr.length-i;j++){
                System.out.print(" "+sArr[i]);
            }
            System.out.println();
        }
        
    }
    
}
