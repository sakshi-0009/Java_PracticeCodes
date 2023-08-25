package Queue;

import java.util.*;
import java.util.concurrent.*;

class Employee1 {
    String str;

    Employee1(String str) {
        this.str = str;
    }

    public String toString() {
        return str;
    }
}
class SortByEmpName implements Comparator<Employee1> {
    public int compare(Employee1 emp1, Employee1 emp2) {
        return emp1.str.compareTo(emp2.str);
    }
}

public class PriorityBlockingQueueDemo2 {

    public static void main(String[] args) {
        PriorityBlockingQueue<Employee1> que = new PriorityBlockingQueue<>(5, new SortByEmpName());
        que.put(new Employee1("kanha"));
		que.put(new Employee1("Badhe"));
		que.put(new Employee1("Ashish"));
		
		System.out.println(que);
		
		que.offer(new Employee1("Rahul"),3,TimeUnit.SECONDS);
		
		System.out.println(que);
    }
}
