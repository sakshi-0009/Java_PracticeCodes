//Same Function name but different parameters

package Polymorphism;

public class OverloadingDemo {

	void fun(int x) {
		System.out.println(x); 		//10
	}
	void fun(float y) {
		System.out.println(y); 		//10.5
	}
	void fun(OverloadingDemo obj) {
		System.out.println(obj); 		//Polymorphism.OverloadingDemo@1de0aca6
	}
	public static void main(String[] args) {
		OverloadingDemo obj = new OverloadingDemo();
		obj.fun(10);
		obj.fun(10.5f);
		
		OverloadingDemo obj1 = new OverloadingDemo();
		obj1.fun(obj); 
		obj1.fun(obj1);
	}
}
