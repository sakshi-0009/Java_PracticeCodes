package MultiThreading;

class MyThread5 extends Thread{
	public void run(){
		Thread T = Thread.currentThread();
		System.out.println(T.getPriority());
	}
}


public class ThreadDemo05 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.isAlive());
		System.out.println(t.isDaemon());
		System.out.println(t.getThreadGroup());

		MyThread5 obj = new MyThread5();
		obj.start();
		
	}
}
