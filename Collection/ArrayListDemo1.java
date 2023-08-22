package Collection;
import java.util.ArrayList;
public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		//add(Object)
		al.add(10);
		al.add(20.5f);
		al.add("Sakshi");
		al.add(10);
		System.out.println(al);
		
		//add(int,Object)
		al.add(3,"Core2Web");
		System.out.println(al);
		
		//size()
		System.out.println(al.size());

		System.out.println(al.contains(10));
		
		System.out.println(al.indexOf("Sakshi"));
		
		System.out.println(al.lastIndexOf(10));
		
		System.out.println(al.get(2));
		
		System.out.println(al.set(3, "Incubator"));
		
		ArrayList al2 = new ArrayList();
		
		al2.add("Shashi");
		al2.add("pranali");
		
		al.addAll(al2);
		System.out.println(al);
		
		al.addAll(3,al2);
		System.out.println(al);
		
		al.remove(3);
		System.out.println(al);
		
		Object arr[] = al.toArray();
		System.out.println(arr);
		for(Object data : arr) {
			System.out.print(data+" ");
		}
		System.out.println();
		al.clear();
		System.out.println(al);
	}
}
