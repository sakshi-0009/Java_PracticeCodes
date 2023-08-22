//StackOverflowError:-

package ExceptionHandling;

public class Client07 {

	static void fun(int x) {
		System.out.println(x);
		System.out.println(++x);
	}
	public static void main(String[] args) {
		try {
			fun(1);
		}catch(StackOverflowError e) {
			System.out.println("StackOverflowException");
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
	}
}
