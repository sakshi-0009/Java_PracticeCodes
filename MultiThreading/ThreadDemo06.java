//				join() 

package MultiThreading;

class MyThread6 extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("In Thread-0");
		}
	}
}
public class ThreadDemo06 {

	public static void main(String[] args) throws InterruptedException{
		MyThread6 obj = new MyThread6();
		obj.start();
		
		obj.join();
		
		for(int i=0; i<10; i++) {
			System.out.println("In Main");
		}
	}
}
