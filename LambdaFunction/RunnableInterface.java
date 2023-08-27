package LambdaFunction;

abstract class RunnableInterface implements Runnable {

	public static void main(String[] args) {
		Runnable obj1 = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		Runnable obj2 = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		// Runnable using lambda function:-
		Runnable obj3 = ()->{
				System.out.println(Thread.currentThread().getName());
		};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		t1.start();
		t2.start();
		t3.start();
	}

}
