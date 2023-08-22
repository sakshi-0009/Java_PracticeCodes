package MultiThreading;

class Demo extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		Thread T = Thread.currentThread();
		System.out.println("Thread-1:"+T.getPriority());
	}
}

class MyThread2 extends Thread{
	public void run() {
		
		System.out.println(Thread.currentThread().getName());

		Thread T = Thread.currentThread();
		System.out.println("Thread-0 :"+T.getPriority());
		
		Demo obj = new Demo();
		obj.start();
		
		
	}
}

public class ThreadDemo02 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
//		MyThread2 obj = new MyThread2();
//		obj.start();
		
		Thread T = Thread.currentThread();
		System.out.println("Main thread: "+T.getPriority());
		
		MyThread2 obj = new MyThread2();
		obj.start();
		
		T.setPriority(7);
		
		MyThread2 obj2 = new MyThread2();
		obj2.start();
	}
}
