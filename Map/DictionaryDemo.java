package Map;
import java.util.*;
public class DictionaryDemo {

	public static void main(String[] args) {
		
		Dictionary d = new Hashtable();
		d.put(10, "Sachin");
		d.put(7, "MSD");
		d.put(18, "Virat");
		d.put(45, "Rohit");
		d.put(1, "KL");

		System.out.println(d);
		
		Enumeration itr1 = d.keys();
		while(itr1.hasMoreElements()) {
			System.out.println(itr1.nextElement());
		}
		
		Enumeration itr2 = d.elements();
		while(itr2.hasMoreElements()) {
			System.out.println(itr2.nextElement());
		}
		
		System.out.println(d.get(10));
		d.remove(1);
		System.out.println(d);
		
		
	}
}
