package Tasks;

public class Task8 {
    public static void main(String[] args) {
        Integer[] arr = {21,17,13,113,119};
        Integer a = -217;
        Integer b = 317;
        Double c = 37.5;
        Double e = 64.0;
        Double f = 121.0;
        Integer g = 99;

        Double d = (c+e+f+g);
        System.out.println(d);
        System.out.println("Abs : " + Math.abs(a));
        System.out.println("Negate : " + Math.negateExact(b));
        System.out.println("Floor : " + (Math.floor(c)+ Math.floor(e)+Math.floor(f)+ Math.floor(g)));
        System.out.println("Round : " + Math.round(c+e+f+g));
        System.out.println("Ratio : " + Math.sqrt(f)+ " : "+Math.sqrt(e));
        System.out.println("Round : " + Math.round(c+e+f+g));

        
    }
    
}
