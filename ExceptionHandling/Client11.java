package ExceptionHandling;

public class Client11 {

	void m1() {
		System.out.println("In m1");
	}
	void m2() {
		System.out.println("In m2");
	}
	public static void main(String[] args) {
		Client11 obj = new Client11();
		obj.m1();
		obj = null;
		try {
			obj.m2();
		}catch(NullPointerException np) {
			System.out.println("NPE");
		}catch(ArithmeticException ae) {
			System.out.println("AE");
		}catch(Exception e) {
			System.out.println("E");
		}finally {
			System.out.println("Connection closed");
		}
		System.out.println("End main");
	}
}
