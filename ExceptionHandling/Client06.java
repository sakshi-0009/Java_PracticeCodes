//Finally Block:-

package ExceptionHandling;

public class Client06 {

	void m1() {
		System.out.println("In m1");
	}
	void m2() {
		System.out.println("In m2");
	}
	public static void main(String[] args) {
		Client06 obj = new Client06();
		obj.m1();
		obj = null;
		try {
			obj.m2();
		}catch(NullPointerException e) {
			System.out.println("NPE");
		}finally {
			System.out.println("Connection closed");
		}
		System.out.println("End main");
	}
}
