package IfElseStatements;

import java.util.Scanner;

public class Months {

	public static void main(String[] args) {
		
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		if(month == 1) {
			System.out.println("January has 31 days !!");
		}
		else if(month == 2) {
			System.out.println("February has 28 days !!");
		}
		else if(month == 3) {
			System.out.println("March has 31 days !!");
		}
		else if(month == 4) {
			System.out.println("April has 31 days !!");
		}
		else if(month == 5) {
			System.out.println("May has 31 days !!");
		}
		else if(month == 6) {
			System.out.println("June has 31 days !!");
		}
		else if(month == 7) {
			System.out.println("July has 31 days !!");
		}
		else if(month == 8) {
			System.out.println("August has 31 days !!");
		}
		else if(month == 9) {
			System.out.println("September has 31 days !!");
		}
		else if(month == 10) {
			System.out.println("October has 31 days !!");
		}
		else if(month == 11) {
			System.out.println("November has 31 days !!");
		}
		else if(month == 12) {
			System.out.println("December has 31 days !!");
		}
		else {
			System.out.println("Invalid Month !!");
		}
	}
}
