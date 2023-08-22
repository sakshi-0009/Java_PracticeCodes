package Map;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
//		HashMap hm = new HashMap();
//		hm.put(11, "Sakshi");
//		hm.put(12, "Prerana");
//		hm.put(13, "Trupti");
//		hm.put(14, "Sanskruti");
//
//		int key1 = 11;
//        System.out.println("Hash code of the key: " + Integer.valueOf(key1).hashCode());
//        int key2 = 12;
//        System.out.println("Hash code of the key: " + Integer.valueOf(key2).hashCode());
//        int key3 = 13;
//        System.out.println("Hash code of the key: " + Integer.valueOf(key3).hashCode());
//        int key4 = 14;
//        System.out.println("Hash code of the key: " + Integer.valueOf(key4).hashCode());
//		System.out.println(hm);
//		System.out.println(Integer.valueOf(11).hashCode()& 15);
//		System.out.println(Integer.valueOf(12).hashCode()& 15);
//		System.out.println(Integer.valueOf(13).hashCode()& 15);
//		System.out.println(Integer.valueOf(14).hashCode()& 15);
		

		


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
		
//		int key1 = 34;
//      System.out.println("Hash code of the key: " + Integer.valueOf(key1).hashCode());
//      int key2 = 35;
//      System.out.println("Hash code of the key: " + Integer.valueOf(key2).hashCode());
//      int key3 = 36;
//      System.out.println("Hash code of the key: " + Integer.valueOf(key3).hashCode());
//      int key4 = 37;
//      System.out.println("Hash code of the key: " + Integer.valueOf(key4).hashCode());
		
//		String s5 = "IND";
//		String s6 = "PAK";
//		String s7 = "AUS";
//		String s8 = "ENG";		
//
//		System.out.println("Hash code of String: ");
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
//		System.out.println(s4.hashCode());
//
//		System.out.println(s5.hashCode() & 17);
//		System.out.println(s6.hashCode() & 17);
//		System.out.println(s7.hashCode() & 17);
//		System.out.println(s8.hashCode() & 17);
		

//		int key5 = 101;
//        System.out.println("Hash code of the key: " + Integer.valueOf(key5).hashCode());
//        int key6 = 112;
//        System.out.println("Hash code of the key: " + Integer.valueOf(key6).hashCode());
//        int key7 = 133;
//        System.out.println("Hash code of the key: " + Integer.valueOf(key7).hashCode());
//        int key8 = 150;
//        System.out.println("Hash code of the key: " + Integer.valueOf(key8).hashCode());

	}
}
