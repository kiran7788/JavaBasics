package integer;

public class MathExample {
    public static void main(String[] args) {
        
        Integer a = 23;
        Integer b = 12;
        Double c = 12.7;
        Double d = 11.2;

        System.out.println("Abs : " + Math.abs(c));
        System.out.println("Abs : " + Math.abs(a));
        System.out.println("Ceil : " + Math.ceil(c));
        System.out.println("Floor : " + Math.floor(c));
        System.out.println("Round : " + Math.round(c));
        System.out.println("Round : " + Math.round(d));
        System.out.println("Sqrt : " + Math.sqrt(c));
        System.out.println("Max : " + Math.max(c,a));
        System.out.println("Min : " + Math.min(a,d));
        System.out.println("Random : " + Math.random());
        System.out.println("Random : " + Math.pow(21, 3));

    }
    
    
    
}
