//Print whether prime number or not

package ForLoop;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a primt number");
		}
	}
}
