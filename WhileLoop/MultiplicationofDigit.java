// Print the multiplication of its digits:

package WhileLoop;

public class MultiplicationofDigit {

	public static void main(String[] args) {
		int n = 3232;
		int multi = 1;
		while(n != 0) {
			int rem = n%10;
			multi = multi*rem;
			n = n/10;
		}
		System.out.println(multi);
	}
}
