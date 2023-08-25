package Queue;
import java.util.concurrent.*;
import java.util.*;
public class LinkedBlockingQueueDemo {

	public static void main(String[] args) throws InterruptedException{
		LinkedBlockingQueue que = new LinkedBlockingQueue(5);
		
		que.put(10);
		que.put(40);
		que.put(20);
		que.put(50);
		que.put(30);

		System.out.println(que);
		Iterator itr = que.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(que.toArray());
		Object arr[] = que.toArray();
		for(Object data : arr) {
			System.out.println(data+" ");
		}
		System.out.println(que);
		que.take();
		que.take();
		que.take();
		System.out.println(que);
		System.out.println("Remaining capacity:"+que.remainingCapacity());
		
		//que.wait(); 	//java.lang.IllegalMonitorStateException
	}
}