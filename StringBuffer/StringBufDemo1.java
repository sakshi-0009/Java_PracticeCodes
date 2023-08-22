package StringBuffer;

public class StringBufDemo1 {

	public static void main(String[] args) {
		
		StringBuffer str1 = new StringBuffer();
		
		for(int i=0; i<18; i++) {
			str1.append(i);
		}
		System.out.println(str1.length());
		System.out.println();
		
		System.out.println(System.identityHashCode(str1));
		str1.append("0009");
		
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
		
		System.out.println(str1.capacity());
	}
}
