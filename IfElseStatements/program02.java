package IfElseStatements;

import java.util.Scanner;

public class program02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		
		if(n==0) {
			System.out.println("Zero");
		} else if(n==1) {
			System.out.println("One");
		} else if(n==2) {
			System.out.println("Two");
		} else if(n==3) {
			System.out.println("Three");
		} else if(n==4) {
			System.out.println("Four");
		} else if(n==5) {
			System.out.println("Five");
		} else if(n>5){
			System.out.println("Entered number is greater than five");
		} else {
			System.out.println("Please enter valid number!");
		}
	}
}
