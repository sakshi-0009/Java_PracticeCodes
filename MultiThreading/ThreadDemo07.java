package MultiThreading;

class MyThread7 extends Thread{
	static Thread nmMain = null;
	public void run() {
		try {
			nmMain.join();
		}catch(InterruptedException ie) {
			
		}
		for(int i=0; i<10; i++) {
			System.out.println("In thread-0");
		}
	}
}
public class ThreadDemo07 {

	public static void main(String[] args) throws InterruptedException{
		MyThread7.nmMain = Thread.currentThread();
		MyThread7 obj = new MyThread7();
		obj.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("In Main");
		}
	}
}
