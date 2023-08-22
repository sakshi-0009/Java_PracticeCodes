package Map;

import java.util.*;

public class HashMapDemo1 {
//	public static void main(String[] args) {
//        int a = 11;
//        int hashCode = a.hashCode();
//
//        System.out.println("Hash code of the string: " + hashCode);
//    }
	public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        int key = 101;
        int hashCode = Integer.valueOf(key).hashCode();
        System.out.println("Hash code of the key: " + hashCode);
        
        String str = "Java";
        int hashCode1 = str.hashCode();

        System.out.println("Hash code of the string: " + hashCode1);

    }
}
