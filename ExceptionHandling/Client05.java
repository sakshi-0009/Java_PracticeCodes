package ExceptionHandling;

public class Client05 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println("In Loop");
		}
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("InterruptedException");
		}
		System.out.println(Thread.currentThread().getName());
	}
}
