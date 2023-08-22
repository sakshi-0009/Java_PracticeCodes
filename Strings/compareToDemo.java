package Strings;

public class compareToDemo {

	public static void main(String[] args) {
		String s1 = "Sakshi";
		String s2 = "sakshi";
		
		String s3 = "sakshi";
		String s4 = "Sakshi";
		
		System.out.println(s1.compareTo(s2));		//-32
		System.out.println(s3.compareTo(s4));		//32
	}
}
