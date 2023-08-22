package IfElseStatements;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a*b;
		
		if(a>0 && b>0) {
			System.out.println(c);
			if(c%2==0) {
				System.out.println("The number is Even!");
			} else {
				System.out.println("The number is Odd!");
			}
		} else {
			System.out.println("Sorry Negative number not allowed!");
		}
	}
}
