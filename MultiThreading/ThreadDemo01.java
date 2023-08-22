package MultiThreading;

class MyThread extends Thread{
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				System.out.println("In Run");
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			
		}
	}
}
public class ThreadDemo01 {

	public static void main(String[] args) throws InterruptedException{
		MyThread obj = new MyThread();
		obj.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("In Main");
			Thread.sleep(1000);
		}
	}
}