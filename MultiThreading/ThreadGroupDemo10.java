package MultiThreading;

class MyThread10 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread());
		try {
			Thread.sleep(2000);
		}catch(InterruptedException ie) {
			System.out.println(ie.toString());
		}
	}
}
public class ThreadGroupDemo10 {

	public static void main(String[] args) throws InterruptedException{
		
		ThreadGroup pThreadGP = new ThreadGroup("India");
		
		MyThread10 obj1 = new MyThread10();
		MyThread10 obj2 = new MyThread10();
		
		Thread t1 = new Thread(pThreadGP,obj1,"Maharashtra");
		Thread t2 = new Thread(pThreadGP,obj2,"GOA");
		t1.start();
		t2.start();
		
		ThreadGroup cThreadGP = new ThreadGroup("Pakistan");
		MyThread10 obj3 = new MyThread10();
		MyThread10 obj4 = new MyThread10();
		
		Thread t3 = new Thread(cThreadGP,obj3,"karachi");
		Thread t4 = new Thread(cThreadGP,obj4,"Lahore");
		t3.start();
		t4.start();
		
//		cThreadGP.interrupt();
		
		System.out.println(pThreadGP.activeCount());
		System.out.println(pThreadGP.activeGroupCount());
		
		
	}
}
