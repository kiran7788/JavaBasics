package constructor;

public class ClassMain {
    public static void main(String[] args) {
        //ClassName objectName = new Constructor
        Sum sum = new Sum(3, 6);
        int ans = (int)sum.add(2, 4);
        float ans1 = Sum.addFloat(6.5f, 7.2f);

        System.out.println(ans);
        System.out.println(ans1);

        Sum1<Integer, Double> su


    }


    
}
