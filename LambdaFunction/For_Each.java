package LambdaFunction;

import java.util.*;

public class For_Each {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(20);

		System.out.println(al);
		
		al.forEach((data)->System.out.println(data));
	}
}
