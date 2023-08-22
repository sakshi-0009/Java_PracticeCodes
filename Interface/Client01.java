package Interface;

interface Demo{
	void fun();
	void gun();
}
class DemoChild implements Demo{
	public void fun() {
		System.out.println("In Fun");
	}
	public void gun() {
		System.out.println("In Gun");
	}
}
public class Client01 {

	public static void main(String[] args) {
		System.out.println("Parent reference and child object");
		Demo obj = new DemoChild();
		obj.fun();
		obj.gun();
		
		System.out.println("Child reference and Child object");
		DemoChild obj1 = new DemoChild();
		obj1.fun();
		obj1.gun();
		
		System.out.println("parent reference and Parent object cannot allowed cause interface object cannot be created");
//		Demo obj2 = new Demo();
//		obj2.fun();
//		obj2.gun();
	}
}
