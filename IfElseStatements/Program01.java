package IfElseStatements;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int English = sc.nextInt();
		int Hindi = sc.nextInt();
		int Science = sc.nextInt();
		int Maths = sc.nextInt();
		int Geography = sc.nextInt();

		int Total = English+Hindi+Science+Maths+Geography;
		
		if(Total<500 && Total>450) {
			System.out.println("Distinction");
		} else if(Total<450 && Total >350) {
			System.out.println("First Class");
		} else if(Total<350 && Total>250) {
			System.out.println("Second Class");
		} else if(Total<250 && Total>=200) {
			System.out.println("Pass class");
		} else {
			System.out.println("fail");
		}
	}
}
