//Print the numbers which are divisible by 4

package WhileLoop;

public class Divisible {

	public static void main(String[] args) {
		 int i = 1;
		 int n = 40;
		 while(i<=n) {
			 if(i%4==0) {
				 System.out.println(i);
			 }
			 i++;
		 }
	}
}
