package Queue;
import java.util.concurrent.*;
import java.util.*;
public class BlockingQueueDemo1 {

	public static void main(String[] args) throws InterruptedException{
		
		BlockingQueue bQueue = new ArrayBlockingQueue(3);
		bQueue.put(10);
		bQueue.put(20);
		bQueue.put(30);
		
		System.out.println(bQueue);
		
		bQueue.offer(40,2,TimeUnit.SECONDS);

		System.out.println(bQueue);
		
		//To put the Queue data into another List or Set.
		ArrayList al = new ArrayList();
		System.out.println("ArrayList-1 : "+al);
		bQueue.drainTo(al); 					//int drainTO(Collection);
		System.out.println("ArrayList-2 : "+al);
		System.out.println("Blocking Queue : "+bQueue);
		
	}
}
