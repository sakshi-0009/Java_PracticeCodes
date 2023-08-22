package Map;
import java.util.*;
public class NavigableMapDemo {

	public static void main(String[] args) {
		
		NavigableMap nm = new TreeMap();
		nm.put("IND", "India");
		nm.put("PAK", "Pakistan");
		nm.put("AUS", "Australia");
		nm.put("ENG", "England");

		System.out.println(nm);
		
		System.out.println(nm.pollFirstEntry());
		System.out.println(nm.pollLastEntry());
		System.out.println(nm.lowerKey("IND"));
		System.out.println(nm.floorKey("IND"));
		System.out.println(nm.ceilingKey("IND"));
		System.out.println(nm.subMap("AUS", "IND"));
		System.out.println(nm.subMap("AUS", true, "PAK", false));
		
	}
}
