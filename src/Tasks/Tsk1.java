package Tasks;

public class Tsk1 {

	public static void main(String[] args) {
		int n=17;
		box(n);
	}
	public static void box(int n) {
		int mid=n/2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int k=mid+j;
				if(i==0&&j<=mid||j==mid||i==mid||j==0&&i<=mid||i==n-1&&j>=mid&&i>=mid){

                    System.out.print("* ");
                }
                
               else if ( j==n-1&&i>=mid||i+j==mid||mid>=j&&i+j==mid){

                   System.out.print("* ");
               }
				else if(mid>=j&&mid>=i&&mid+j==i||i==j||i+j-(mid)==n-1) {
            
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
    }
}