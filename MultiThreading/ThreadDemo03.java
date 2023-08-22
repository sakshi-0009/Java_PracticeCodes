package MultiThreading;

class MyThread3 implements Runnable{
	public void run() {
		System.out.println("In Run");
		System.out.println(Thread.currentThread().getName());
	}
}

public class ThreadDemo03 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		MyThread3 obj = new MyThread3();
		Thread t = new Thread(obj);
		t.start();
	}
}
