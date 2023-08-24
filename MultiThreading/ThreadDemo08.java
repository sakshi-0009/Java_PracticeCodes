//					Yield()

package MultiThreading;

class MyThread8 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class ThreadDemo08 {

	public static void main(String[] args) {
		MyThread8 obj = new MyThread8();
		obj.start();
		Thread.yield();
		System.out.println(Thread.currentThread().getName());
	}
}
