package stl;
import java.util.*;

public class StlMap {

    public static void main(String[] args) {
        Map<String, String>map = new HashMap<String, String>();
        map.put("name", "Kiran");
        map.put("age", "91");
        map.put("gender", "male");

        System.out.println(map.get("name"));
        System.out.println(map.get("age"));
        System.out.println(map.get("gender"));

        Map<String, String>map1 = new HashMap<String, String>();
        map.put("Age", 91);
        map.put("pincode", "");

        System.out.println(map1.get("Age"));
        System.out.println(map1.get("pincode"));
        System.out.println(map1.get("gender"));

        
    }

    
}
