// Print the table of 2 usinf while and for loop:

package BasicForWhile;

public class TableOf2 {

	public static void main(String[] args) {
		
		int n = 2;
		int i = 1;
		while(i<=10) {
			System.out.println(n*i);
			i++;
		}
		
		System.out.println("-------------");
		
		for(int j = 1; j <= 10; j++) {
			System.out.println(n*j);
		}
	}
}
