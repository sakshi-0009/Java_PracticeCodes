package Collection;
import java.util.*;
public class VarDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		for(var x : al) {
			System.out.println(x.getClass().getName());
			System.out.println(x);
		}
	}
}
