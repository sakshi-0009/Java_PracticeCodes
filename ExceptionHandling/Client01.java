// Default Exception Handler : ArithmeticException

package ExceptionHandling;

class Demo{
	void m2() {
		System.out.println("Start m2");
		System.out.println(10/0);		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println("End m2");
	}
	void m1() {
		System.out.println("Start m1");
		m2();
		System.out.println("End m1");
	}
}

public class Client01 {

	public static void main(String[] args) {
		System.out.println("Start main");
		Demo obj = new Demo();
		obj.m1();
		System.out.println("End main");
	}
}
