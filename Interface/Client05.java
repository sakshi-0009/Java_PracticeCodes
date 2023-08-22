package Interface;

interface Demo5{
	default void fun() {
		System.out.println("In Fun Demo1");
	}
}
interface Demo6{
	default void fun() {
		System.out.println("In Fun Demo2");

	}
}

class DemoChild5 implements Demo5, Demo6{
	public void fun() {
		System.out.println("In child fun");
	}
}
public class Client05 {
	public static void main(String[] args) {
		System.out.println("If we use default keyword in interface method then we have to compulsory override that methods");

		System.out.println("Interface Demo5 reference and child object");
		Demo5 obj = new DemoChild5();
		obj.fun();
		
		System.out.println("Interface Demo6 reference and Child object");
		Demo6 obj1 = new DemoChild5();
		obj.fun();
		
		System.out.println("Child class reference and Child object");
		DemoChild5 obj2 = new DemoChild5();
		obj2.fun();
	}
}
