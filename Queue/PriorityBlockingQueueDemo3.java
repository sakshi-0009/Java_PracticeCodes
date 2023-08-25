package Queue;
import java.util.concurrent.*;

class Employee implements Comparable{
	String str;
	Employee(String str){
		this.str = str;
	}
	public String toString() {
		return str;
	}
	public int compareTo(Object obj) {
		return str.compareTo(((Employee)obj).str);
	}
}

public class PriorityBlockingQueueDemo3 {

	public static void main(String[] args) {
		PriorityBlockingQueue que = new PriorityBlockingQueue();
		que.put(new Employee("Kanha"));
		que.put(new Employee("Badhe"));
		que.put(new Employee("Ashish"));
		
		
		System.out.println(que);
		
		que.offer(new Employee("Rahul"),3,TimeUnit.SECONDS);
		
		System.out.println(que);

	}
}
