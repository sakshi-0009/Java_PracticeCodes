package Strings;

import java.util.Scanner;

public class StringDemo4 {
	
	static int myCompare(String s1, String s2) {
		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		
		int length;
		if(arr1.length>arr2.length) {
			length = arr1.length;
		} else {
			length=arr2.length;
		}
		for(int i=0; i<length; i++) {
			if(arr1[i]!=arr2[i]) {
				return arr1[i]-arr2[i];
			}
			else {
				return arr1.length-arr2.length;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		boolean a = true;
		while(a) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two Strings : ");
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			
			System.out.println(myCompare(s1,s2));
		}
	}
}
