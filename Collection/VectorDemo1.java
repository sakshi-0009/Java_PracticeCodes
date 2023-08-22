package Collection;
import java.util.*;

public class VectorDemo1 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);

		System.out.println(v);
		System.out.println("Default capacity : "+v.capacity());
		System.out.println("Index of 30 is : "+v.indexOf(30));
		v.clone();
		System.out.println(v);
		
		Object arr[] = v.toArray();
		System.out.println(arr);
		for(Object data : arr) {
			System.out.print(data+" ");
		}
		System.out.println();
		v.clear();
		System.out.println(v);
	}
}
