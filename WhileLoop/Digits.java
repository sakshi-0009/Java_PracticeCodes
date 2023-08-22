//print all the digits of an integer

package WhileLoop;

public class Digits {

	public static void main(String[] args) {
		int n = 6523;
		while(n!=0) {
			System.out.println(n%10);
			n = n/10;
		}
	}
}
