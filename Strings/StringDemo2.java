package Strings;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1 = "Sakshi";
		String s2 = new String("Sakshi");
		String s3 = "Sakshi";
		String s4 = new String("Sakshi");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
}
