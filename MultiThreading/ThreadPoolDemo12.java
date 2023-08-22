package MultiThreading;

import java.util.concurrent.*;

class MyThread12 extends Thread{
	int num;
	MyThread12(int num){
		this.num = num;
	}
	public void run() {
		System.out.println(Thread.currentThread()+" Start Thread : "+num);
		dailyTask();
		System.out.println(Thread.currentThread()+" End Thread : "+num);
	}
	void dailyTask() {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ie) {
			
		}
	}
}
public class ThreadPoolDemo12 {

	public static void main(String[] args) {
		ThreadPoolExecutor tpe = (ThreadPoolExecutor)Executors.newFixedThreadPool(3);

		for(int i=0; i<6; i++) {
			MyThread12 obj = new MyThread12(i);
			tpe.execute(obj);
		}
		tpe.shutdown();
	}
}
