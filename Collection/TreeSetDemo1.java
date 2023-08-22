package Collection;

import java.util.*;

class Result implements Comparable{
	String name = null;
	float pointer = 0.0f;
	
	Result(String name, float pointer){
		this.name = name;
		this.pointer = pointer;
	}
	public int compareTo(Object obj) {
	    float otherPointer = ((Result)obj).pointer;
	    return Float.compare(this.pointer, otherPointer);
	}
	public String toString() {
		return name+":"+pointer;
	}
}
class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		
		System.out.println("TE 2019 Pattern Result:");
		ts.add(new Result("Prerana",8.57f));
		ts.add(new Result("Rutuja",9.71f));
		ts.add(new Result("Sakshi",8.95f));
		ts.add(new Result("Sanskruti",8.64f));
		ts.add(new Result("Monali",9.24f));
		
		System.out.println(ts);
	}
}
