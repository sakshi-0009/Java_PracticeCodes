package ExceptionHandling;

public class Client03 {

	/*public static void main(String[] args) throws ArithmeticException{
		System.out.println("Start main");
		System.out.println(10/0);	//Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println("End main");
	}*/
	
	public static void main(String[] args) {
		System.out.println("Start main");
		try {
			System.out.println(10/0);		// Risky code
		}catch(ArithmeticException e) {
			System.out.println("Divide by zero not allowed");	//Handling code
		}
		System.out.println("End main");
	}
}
