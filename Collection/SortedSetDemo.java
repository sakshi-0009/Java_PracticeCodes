package Collection;

import java.util.*;

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		s.add("Kanha");
		s.add("Rahul");
		s.add("Ashish");
		s.add("Badhe");	
		System.out.println(s);
		
		System.out.println(s.headSet("Kanha"));
		System.out.println(s.tailSet("Kanha"));
		System.out.println(s.subSet("Badhe", "Rahul"));
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s);
	}
}
