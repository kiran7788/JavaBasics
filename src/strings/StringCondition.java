package strings;

public class StringCondition {
    public static void main(String[] args) {
        String str1 = "Hello", str3="hello", str2 = "World";
        System.out.println("str1 :" + str1+ "  |str2 :" +str2);
        if(str1.equalsIgnoreCase(str3)){
            
            System.out.println("str1 : " + str1+ "  |str2 : " +str2 + ": true");
        }
        else{
            
            System.out.println("str1 :" + str1+ "==str2 :" +str2 + ": false");
        }
    }
    
}
