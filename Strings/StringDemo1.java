package Strings;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1 = "sakshi";
		String s2 = "0009";
		
		String s3 = s1+s2;
		String s4 = s1.concat(s2);
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println();
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		/* s1+s2 method and concat method are different and two different objects are created on the heap*/
		//s1+s2 method internally calls stringBuilder append() method. 
	}
}
