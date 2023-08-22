package SwitchCases;

import java.util.Scanner;

public class Program05 {

public static void main(String[] args) {
		
		System.out.println("Welcome to Seasons Mall!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the section you want to shopping:");
		String str = sc.next();
		
		switch(str) {
		case "Mens":{
			System.out.println("Adult||Child");
			String str1 = sc.next();
			switch(str1) {
			case "Adult":
				System.out.println("Welcome to Adult Cloths Section!");
				break;
				
			case "Child":
				System.out.println("Welcome to Child Cloths Section!");
				break;
			}
			break;
			}
		case "Womens":{
			System.out.println("Adult||Child");
			String str1 = sc.next();
			switch(str1) {
			case "Adult":
				System.out.println("Welcome to Adult Cloths Section!");
				break;
				
			case "Child":
				System.out.println("Welcome to Child Cloths Section!");
				break;
			}
			break;
			}
		default:{
			System.out.println("Please enter the valid section!");
		}
		}
		System.out.println("Thank you! Visit again!");
	}
}
