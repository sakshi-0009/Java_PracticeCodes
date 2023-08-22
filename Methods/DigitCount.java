package Methods;

import java.util.Scanner;

public class DigitCount {

	static void digitCount(int n) {
		int count = 0;
		while(n != 0) {
			n = n/10;
			count++;
		}
		System.out.println(count);
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		digitCount(n);
	}
}
