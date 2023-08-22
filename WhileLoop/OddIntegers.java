//print odd integers from 1 to N

package WhileLoop;

public class OddIntegers {
	
	public static void main(String[] args) {
		 int i = 1;
		 int n = 10;
		 while(i<=n) {
			 if(i%2 != 0) {
				 System.out.println(i);
			 }
			 i++;
		 }
		
	}
}

