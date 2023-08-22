package Queue;
import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		
		Queue obj = new LinkedList();
		obj.offer(20);
		obj.offer(10);
		obj.offer(50);
		obj.offer(30);
		obj.offer(40);
		System.out.println(obj);

	}
}
