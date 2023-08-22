package Map;
import java.util.*;

class Demo{
	String str;
	Demo(String str){
		this.str = str;
	}
	public String toString() {
		return str;
	}
	public void Finalize() {
		System.out.println("Notify!");
	}
}

public class WeakhashMapDemo {

	public static void main(String[] args) {
		
		Demo obj1 = new Demo("Core2Web");
		Demo obj2 = new Demo("Biencaps");
		Demo obj3 = new Demo("Incubator");
		
		WeakHashMap wm = new WeakHashMap();
		
		wm.put(obj1, 2022);
		wm.put(obj2, 2023);
		wm.put(obj3, 2024);
		
		obj1 = null;
		obj2 = null;
		
		System.gc();
		
		System.out.println(wm);
	}
}
