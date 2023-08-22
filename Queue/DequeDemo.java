package Queue;
import java.util.*;
public class DequeDemo {

	public static void main(String[] args) {
		Deque obj = new ArrayDeque();
		obj.offer(10);
		obj.offer(40);
		obj.offer(20);
		obj.offer(30);
		
		System.out.println(obj);
		
		obj.pollFirst();
		System.out.println(obj);
		
		obj.pollLast();
		System.out.println(obj);
		
		System.out.println(obj.peekFirst());
		System.out.println(obj.peekLast());
		System.out.println(obj);
		
		//Iterator
		System.out.println("Iterator");
		Iterator itr1 = obj.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("Descending Itertor");
		Iterator itr2 = obj.descendingIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
