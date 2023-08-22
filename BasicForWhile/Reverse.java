package BasicForWhile;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		 System.out.println("Enter number : ");
		 Scanner sc = new Scanner(System.in);
		 int i = sc.nextInt();
		 int reverse = 0;
		 while(i != 0) {
			 int rem = i%10;
			 reverse = reverse*10+rem;
			 i = i/10;
		 }
		 System.out.println(reverse);
		 
		 System.out.println("------");
		 
// Reverse the given integer using for loop
		
		 		
		 		 System.out.println("Enter number : ");
		 		 Scanner sc1 = new Scanner(System.in);
		 		 int j = sc1.nextInt();
		 		 int reverse1 = 0;
		 		 for(;j != 0;) {
		 			 int rem1 = j%10;
		 			 reverse1 = reverse1*10+rem1;
		 			 j = j/10;
		 		 }
		 		 System.out.println(reverse1);

	}
}

