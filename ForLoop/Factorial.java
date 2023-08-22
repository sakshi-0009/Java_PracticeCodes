// Print factorial of the given number :

package ForLoop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int facto = 1;
		for(int i=1;i<=n;i++) {
			facto = facto*i;
		}
		System.out.println(facto);
	}
}
