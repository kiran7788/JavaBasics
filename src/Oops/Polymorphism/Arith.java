package Oops.Polymorphism;

public class Arith {
    int a=0,b=0;
    String name;
    
    public Arith(int a, int b){
        
    }
    
    public Arith(int a){
   
    }

    public Arith(String name){
    
    }
    
    public Arith(float percentage ){
    
    }
    // method over loading
    public int add(int a, int b){
        return a+b;
        
    }
    
    public int add(int a, int b,int c){
        return a+b+c;
        
    }
    
    public int add(String name){
        return a+b+c;
        
    }
    
    public int add(float percentage ){
        
        return a+b;
    }

}
