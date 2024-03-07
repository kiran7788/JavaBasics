package strings;

public class StrDefault {
    public static void main(String[] args) {
        String s="Hello World All";
        String response ="";
        System.out.println("Length "+ s.length());
        System.out.println("Length "+ s.toCharArray().length);
        System.out.println("Replace "+ s.replace("world", "all"));
        System.out.println("SubString "+ s.substring(0, 8));
        System.out.println("Concat "+ s.concat("All"));
        System.out.println("Split "+ s.split(" ")[0]+"    2 : "+ s.split(" ")[1]);
        System.out.println("Trim "+ s.trim());
        System.out.println("Index of "+ s.indexOf(4));
        System.out.println("Uppercase "+ s.toUpperCase());
        System.out.println("Tostring "+ s.toString());
        System.out.println();

        int j=3;
        String s1= String.valueOf(j);
        System.out.println("equals : "+s1.equals("3"));

        String[] sArr = s.split("  ");
        char[] sArr1= s.toCharArray();

        System.out.println("************Split**************");
        
        for (int i=0; i<sArr.length;i++){
            System.out.println(sArr[i]);
        }
        
        
        System.out.println("************toChar array**************");
        
        for (int i=0; i<sArr.length;i++){
            System.out.println(sArr1[i]);
        }

        for (int i=0; i<s.length();i++){
            if(s.substring(i).contains(s.substring(i-1, i-1))){
                
                if(!response.contains(s.substring(i-1,i-1))){

                }
            }int loop;
            i++;
        }
    }
    
}
