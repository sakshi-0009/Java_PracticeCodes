package Map;
import java.util.*;

public class SortedMapDemo1 {

	public static void main(String[] args) {
		
		SortedMap sm = new TreeMap();
		sm.put("IND", "India");
		sm.put("PAK", "Pakistan");
		sm.put("AUS", "Australia");
		sm.put("ENG", "England");

		System.out.println(sm);
		
		System.out.println(sm.subMap("AUS", "PAK"));
		System.out.println(sm.headMap("IND"));
		System.out.println(sm.tailMap("IND"));
		System.out.println(sm.firstKey());
		System.out.println(sm.lastKey());
		System.out.println(sm.keySet());
		System.out.println(sm.values());
		System.out.println(sm.entrySet());
	}
}
