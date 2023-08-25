package Queue;
import java.util.concurrent.*;
import java.util.*;
public class BlockingQueueDemo2 {

	public static void main(String[] args) throws InterruptedException{
		
		BlockingQueue bQueue = new ArrayBlockingQueue(5);
		bQueue.put(10);
		bQueue.put(20);
		bQueue.put(30);
		
		System.out.println(bQueue);
		System.out.println("Stating capacity of Queue: "+bQueue.remainingCapacity());
		
		bQueue.offer(40,2,TimeUnit.SECONDS); 	//Adds element after waiting for 2 seconds

		System.out.println(bQueue);
		
		bQueue.take();
		
		System.out.println(bQueue); 	//Removes first element
		 
		System.out.println(bQueue.poll(2, TimeUnit.SECONDS)); 	//returns the removed element.
		
		System.out.println(bQueue);
		
		System.out.println("Remaining capacity : "+bQueue.remainingCapacity());
	}
}
