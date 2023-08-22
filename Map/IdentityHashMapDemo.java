package Map;
import java.util.*;
public class IdentityHashMapDemo {

	public static void main(String[] args) {
		 
		IdentityHashMap hm = new IdentityHashMap();
		hm.put(new Integer(10), "Kanha");
		hm.put(new Integer(40), "Badhe");
		hm.put(new Integer(20), "Ashish");
		hm.put(new Integer(30), "Rahul");

		System.out.println(hm);
		
	}
}
