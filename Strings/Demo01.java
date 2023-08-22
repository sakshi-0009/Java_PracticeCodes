package Strings;

public class Demo01 {

	public static void main(String[] args) {
		String str1 = "Sakshi";
		String str2 = new String("Sakshi");
		String str3 = "Sakshi";
		String str4 = new String("Sakshi");
		
		char str5[] = {'s','a','k','s','h','i'};
		String str6 = new String(str5);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str6);
		
		System.out.println();
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));		
		System.out.println(System.identityHashCode(str6));
	}
}
