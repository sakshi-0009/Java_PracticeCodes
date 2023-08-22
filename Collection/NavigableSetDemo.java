package Collection;
import java.util.*;
public class NavigableSetDemo {

	public static void main(String[] args) {
		NavigableSet ns = new TreeSet();
		ns.add("Rahul");
		ns.add("Badhe");
		ns.add("Ashish");
		ns.add("Kanha");
		
		System.out.println(ns);
		System.out.println(ns.lower("Badhe"));
		System.out.println(ns.floor("Badhe"));
		System.out.println(ns.ceiling("Kanha"));
		System.out.println(ns.pollFirst());
		System.out.println(ns.pollLast());
		System.out.println(ns.higher("Ashish"));
		System.out.println(ns.higher("Kanha"));
		System.out.println(ns.descendingSet());
	}
}
