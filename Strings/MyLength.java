package Strings;
import java.util.*;
public class MyLength {
	static int count(String s1) {
		int count = 0;
		
		char arr[] = s1.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		boolean a = true;
		while(a) {
			System.out.println("Enter String : ");
			Scanner sc = new Scanner(System.in);
			String s1 = sc.nextLine();
			System.out.println(count(s1));
		}
	}
}
