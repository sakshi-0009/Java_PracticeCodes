package Queue;
import java.util.*;

class Project implements Comparable<Project>{
	String pName = null;
	int teamSize = 0;
	int duration = 0;
	
	Project(String pName, int teamSize, int duration){
		this.pName = pName;
		this.teamSize = teamSize;
		this.duration = duration;
	}
	public int compareTo(Project obj) {
        return Integer.compare(this.duration, obj.duration);
	}
	public String toString() {
		return "{"+pName+" : "+duration+"}";
	}
}
public class PriorityQueueDemo1 {

    public static void main(String[] args) {
        PriorityQueue<Project> que = new PriorityQueue<>();
        que.offer(new Project("TODOList", 20, 4));
        que.offer(new Project("BankingApplication", 10, 10));
        que.offer(new Project("WebBrowser", 60, 7));

        while (!que.isEmpty()) {
            System.out.println(que.poll());
        }
    }
}

