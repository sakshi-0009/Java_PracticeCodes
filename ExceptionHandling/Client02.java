// Default Exception Handler : NullPointerException

package ExceptionHandling;

class Demo2{
	void m2() {
		System.out.println("In m2");
	}
	void m1() {
		System.out.println("In m1");
	}
}

public class Client02 {
	
	public static void main(String[] args) {
		System.out.println("Start main");
		Demo2 obj = new Demo2();
		obj.m1();
		obj = null;		//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "ExceptionHandling.Demo2.m2()" because "obj" is null
		obj.m2();
		System.out.println("End main");
	}
}
