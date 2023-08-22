package MultiThreading;

class MyThread9 extends Thread{
	MyThread9(ThreadGroup tg, String str){
		super(tg,str);
	}
	public void run() {
		System.out.println(Thread.currentThread());
		try {
			Thread.sleep(2000);
		}catch(InterruptedException ie) {
			System.out.println(ie.toString());
		}
	}
}
public class ThreadGroupDemo09 {

	public static void main(String[] args) throws InterruptedException{
	
		ThreadGroup pThreadGP = new ThreadGroup("India");
		MyThread9 t1 = new MyThread9(pThreadGP,"Maharashtra");
		MyThread9 t2 = new MyThread9(pThreadGP,"GOA");
		t1.start();
		t2.start();
		
		ThreadGroup cThreadGP = new ThreadGroup("Pakistan");
		MyThread9 t3 = new MyThread9(cThreadGP,"Karachi");
		MyThread9 t4 = new MyThread9(cThreadGP,"Lahore");
		t3.start();
		t4.start();
		
//		cThreadGP.interrupt();
		
		System.out.println(pThreadGP.activeCount());
		System.out.println(pThreadGP.activeGroupCount());
		
		
	}
}
