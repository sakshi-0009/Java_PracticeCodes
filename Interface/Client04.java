package Interface;

interface Demo4{
	void fun();
	default void gun() {
		System.out.println("In Default interface Gun method");
	}
}

class DemoChild4 implements Demo4{
	public void fun() {
		System.out.println("In child Fun method");
	}
}

public class Client04 {
	public static void main(String[] args) {
		Demo4 obj = new DemoChild4();
		obj.fun();
		obj.gun();
	}
	
}
