package Queue;
import java.util.concurrent.*;
import java.util.*;
public class ArrayBlockingQueueDemo1 {

	public static void main(String[] args) throws InterruptedException{
		ArrayBlockingQueue que = new ArrayBlockingQueue(5);
		
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
		//que.wait(); 	//java.lang.IllegalMonitorStateException
	}
}
