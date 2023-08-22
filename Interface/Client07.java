package Interface;

interface Demo8{
	static int x = 10;
	void fun();
}
interface Demo9{
	static int x = 10;
	void fun();
}

class DemoChild7 implements Demo8,Demo9{
	public void fun() {
		System.out.println("Interface supports multiple inheritance");
		System.out.println("In child fun");
	}
}
public class Client07 {

	public static void main(String[] args) {
		DemoChild7 obj = new DemoChild7();
		obj.fun();
		System.out.println(Demo8.x);
		System.out.println(Demo9.x);
	}
	
}