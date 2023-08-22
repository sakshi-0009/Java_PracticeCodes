package Map;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {

		HashMap hm1 = new HashMap();
		hm1.put(101, "IND");
		hm1.put(112, "PAK");
		hm1.put(133, "AUS");
		hm1.put(150, "ENG");
		
		System.out.println(hm1);
		System.out.println("HashCode for hm1 :");
		System.out.println(Integer.valueOf(101).hashCode()% 16);
		System.out.println(Integer.valueOf(112).hashCode()% 16);
		System.out.println(Integer.valueOf(133).hashCode()% 16);
		System.out.println(Integer.valueOf(150).hashCode()% 16);
		
		HashMap hm2 = new HashMap();
		hm2.put(34, "IND");
		hm2.put(35, "PAK");
		hm2.put(36, "AUS");
		hm2.put(37, "ENG");

		System.out.println(hm2);
		System.out.println("HashCode for hm2 :");
		
		System.out.println(Integer.valueOf(34).hashCode()% 16);
		System.out.println(Integer.valueOf(35).hashCode()% 16);
		System.out.println(Integer.valueOf(36).hashCode()% 16);
		System.out.println(Integer.valueOf(37).hashCode()% 16);	
	}
}
