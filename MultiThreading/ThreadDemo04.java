package MultiThreading;

class MyThread4 extends Thread{
	public void run(){
		Thread T = Thread.currentThread();
		System.out.println(T.getPriority());
	}
}

public class ThreadDemo04 {

	public static void main(String[] args) {
		Thread T = Thread.currentThread();
		System.out.println(T.getPriority());
		
		MyThread4 obj = new MyThread4();
		obj.start();
		
		T.setPriority(7);
		
		MyThread4 obj2 = new MyThread4();
		obj2.start();
	}
}
