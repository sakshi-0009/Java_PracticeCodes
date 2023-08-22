// Print the sum of its digits:

package WhileLoop;

public class SumofDigit {

	public static void main(String[] args) {
		int n = 3546;
		int sum = 0;
		while(n != 0) {
			int rem = n%10;
			sum = sum+rem;
			n = n/10;
		}
		System.out.println(sum);
	}
}
