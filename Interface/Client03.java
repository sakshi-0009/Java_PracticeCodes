package Interface;

interface Demo2{
	void fun();
}
interface Demo3{
	void fun();
}

class DemoChild3 implements Demo2,Demo3{
	public void fun() {
		System.out.println("Interface supports multiple inheritance");
		System.out.println("In child fun");
	}
}

public class Client03 {

	public static void main(String[] args) {
		Demo2 obj1 = new DemoChild3();
		obj1.fun();
	}
}
