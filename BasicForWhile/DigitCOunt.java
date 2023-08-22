// Count the number of digits using while loop :

package BasicForWhile;

public class DigitCOunt {

	public static void main(String[] args) {
		int n = 94211423;
		int count = 0;
		while(n != 0) {
			n = n/10;
			count++;
		}
		System.out.println(count);
		
		System.out.println("------");
		
		
// Count the number of digits using while loop :
		
		int m = 123456789;
		int sum = 0;
		for(;m!=0;) {
			m = m/10;
			sum++;
		}
		System.out.println(sum);
	}
}
