package MultiThreading;

import java.util.concurrent.*;

class MyThread11 extends Thread{
	int num;
	MyThread11(int num){
		this.num = num;
	}
	public void run() {
		System.out.println(Thread.currentThread()+" Start Thread : "+num);
		dailyTask();
		System.out.println(Thread.currentThread()+" End Thread : "+num);
	}
	void dailyTask() {
		try {
			Thread.sleep(5000);
		}catch(InterruptedException ie) {
			
		}
	}
}

public class ThreadPoolDemo11 {

	public static void main(String[] args) {
		ExecutorService ser = Executors.newFixedThreadPool(3);
//		ExecutorService ser = Executors.newCachedThreadPool();
//		ExecutorService ser = Executors.newSingleThreadExecutor();
//		ExecutorService ser = Executors.newScheduledThreadPool(3);

		for(int i=0; i<6; i++) {
			MyThread11 obj = new MyThread11(i);
			ser.execute(obj);
		}
		ser.shutdown();
	}
}
