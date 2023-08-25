package Queue;
import java.util.concurrent.*;
import java.util.*;
import java.util.concurrent.*;

public class PriorityBlockingQueueDemo1 {

	public static void main(String[] args) throws InterruptedException{
		PriorityBlockingQueue que = new PriorityBlockingQueue(5);
		
		System.out.println("Starting capacity : "+que.remainingCapacity());

		que.put(new Employee("Kanha"));
		que.put(new Employee("Badhe"));
		que.put(new Employee("Ashish"));
		
		
		System.out.println(que);
		
		que.offer(new Employee("Rahul"),3,TimeUnit.SECONDS);

		System.out.println(que);
		System.out.println("Capacity after adding elements : "+que.remainingCapacity());
	}
}
