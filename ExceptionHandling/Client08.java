//Throw:-

package ExceptionHandling;
import java.util.*;
public class Client08 {

	public static void main(String[] args) {
		System.out.println("Enter Integer value: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		try {
			if(x==0) {
				throw new ArithmeticException("Divide by zero");
			}
			System.out.println(10/x);
		}catch(ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
	}
}
