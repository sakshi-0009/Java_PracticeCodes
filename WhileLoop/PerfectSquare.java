// Print perfect square till N

package WhileLoop;

public class PerfectSquare {

	public static void main(String[] args) {
		int n = 100;
		int i = 1;
		while(i*i<=n) {
			System.out.println(i*i);
			i++;
		}
	}
}
