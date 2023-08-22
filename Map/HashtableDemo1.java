package Map;
import java.util.*;
public class HashtableDemo1 {

	public static void main(String[] args) {
		
		Hashtable hs = new Hashtable();
		hs.put(10, "Sachin");
		hs.put(7, "MSD");
		hs.put(18, "Virat");
		hs.put(45, "Rohit");
		hs.put(1, "KL");

		System.out.println(hs);
		
		System.out.println(hs.keySet());
		System.out.println(hs.values());
	}
}
