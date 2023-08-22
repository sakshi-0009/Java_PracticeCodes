package Interface;

interface Demo1{
	void fun();
	void gun();
}
abstract class DemoChild1 implements Demo1{
	public void fun() {
		System.out.println("In Fun");
	}
}
class DemoChild2 extends DemoChild1{
	public void gun() {
		System.out.println("In Gun");
	}
}
public class Client02 {

	public static void main(String[] args) {
		System.out.println("Interface reference and child object");
		Demo1 obj = new DemoChild2();
		obj.fun();
		obj.gun();
		
		System.out.println("Abstract class DemoChild1 reference and Child object");
		DemoChild1 obj1 = new DemoChild2();
		obj1.fun();
		obj1.gun();
		
		System.out.println("Child class DemoChild2 reference and Child object");
		DemoChild1 obj2 = new DemoChild2();
		obj2.fun();
		obj2.gun();
	}
}