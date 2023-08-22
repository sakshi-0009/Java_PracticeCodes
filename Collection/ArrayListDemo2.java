package Collection;
import java.util.*;
public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Shashi");
		al.add("Rahul");
		al.add("Kanha");
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			if("Rahul".equals(itr.next())) {
				itr.remove();
				System.out.println(itr.next());
			}
		}
		System.out.println(al);
	}
}
