package Tasks;


public class Prime {
    public static void main(String[] args) {

       int prime(isPrime);
    }
       public static Boolean isPrime(Integer num){

        int  [] arr = {21,11,14,17};

        if ( num <= 1) {
            
            return false;
        }

        for (int i=2; i<Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }

    }
  
}
