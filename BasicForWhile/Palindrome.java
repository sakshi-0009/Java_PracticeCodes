//Check whether the number is palindrome or not using while loop :

package BasicForWhile;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter number : ");
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int reverse = 0;
		 int temp = n;
		 while(n != 0) {
			 int rem = n%10;
			 reverse = reverse*10+rem;
			 n = n/10;
		 }
		 if(reverse==temp) {
			 System.out.println("Palindrome");
		 } else {
			 System.out.println("Not Palindrome");
		 }
		 
//Check whether the number is palindrome or not using for loop :

		 
		 System.out.println("Enter number : ");
 		 Scanner sc1 = new Scanner(System.in);
 		 int j = sc1.nextInt();
 		 int reverse1 = 0;
 		 int temp1 = j;
 		 for(;j != 0;) {
 			 int rem1 = j%10;
 			 reverse1 = reverse1*10+rem1;
 			 j = j/10;
 		 }
 		if(reverse1==temp1) {
			 System.out.println("Palindrome");
		 } else {
			 System.out.println("Not Palindrome");
		 }
	}
}
