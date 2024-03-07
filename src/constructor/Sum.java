package constructor;

public class Sum {

    Integer a,b;
    public Sum(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    private int add (){
        return a+b;
    }
    
    public int  add(int x, int y){
        return x+y;
    }
    public static float addFloat(float x, float y){
        return x+y;
    }

    public Double add(Double x, Double y){
        return x+y;
    }

}
