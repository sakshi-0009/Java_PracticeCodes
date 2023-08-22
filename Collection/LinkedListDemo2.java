package Collection;

import java.util.*;

class CricPlayer{
	int jerNo = 0;
	String pName = null;
	
	CricPlayer(int jerNo, String pName){
		this.jerNo = jerNo;
		this.pName = pName;
	}
	public String toString() {
		return jerNo+":"+pName;
	}
}
public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		LL.add(new CricPlayer(18,"Virat"));
		LL.add(new CricPlayer(7,"Dhoni"));
		LL.add(new CricPlayer(45,"Rohit"));
		
		System.out.println(LL);

		LinkedList LL1 = new LinkedList();
		LL1.add("Sakshi");
		LL1.add("Sanskruti");
		LL1.add("Prerana");
		LL.addAll(LL1);
		System.out.println(LL);
	}
}
