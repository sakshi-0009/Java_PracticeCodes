package BasicForWhile;

import java.util.Scanner;

public class OddCount {

	public static void main(String[] args) {
		
		 System.out.println("Enter number : ");
		 Scanner sc = new Scanner(System.in);
		 int i = sc.nextInt();
		 int count = 0;
		 while(i%2 != 0) {
			 i = i%10;
			 count++;
			 i = i/10;
		 }
		 System.out.println(count);

	}
}

