package Queue;

import java.util.*;

class Project1 {
    String pName = null;
    int teamSize = 0;
    int duration = 0;

    Project1(String pName, int teamSize, int duration) {
        this.pName = pName;
        this.teamSize = teamSize;
        this.duration = duration;
    }

    public String toString() {
        return "{" + pName + " : " + duration + "}";
    }
}

class SortByName implements Comparator{
	public int compare(Object obj1, Object obj2) {
		return ((Project1)obj1).pName.compareTo(((Project1)obj2).pName);
	}
}
class SortByDuration implements Comparator<Project1> {
    public int compare(Project1 obj1, Project1 obj2) {
        return Integer.compare(obj1.duration, obj2.duration);
    }
}

public class PriorityQueueDemo2 {

    public static void main(String[] args) {
        PriorityQueue que = new PriorityQueue(new SortByName());

        que.offer(new Project1("TODOList", 20, 5));
        que.offer(new Project1("BankingApplication", 10, 7));
        que.offer(new Project1("WebBrowser", 60, 3));

        System.out.println(que);
            
        PriorityQueue<Project1> que1 = new PriorityQueue<>(new SortByDuration());
        
        que1.offer(new Project1("TODOList", 20, 5));
        que1.offer(new Project1("BankingApplication", 10, 7));
        que1.offer(new Project1("WebBrowser", 60, 3));

        while (!que1.isEmpty()) {
            System.out.println(que1.poll());
        }
    }
}
