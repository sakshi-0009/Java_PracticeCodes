package Interface;

interface Demo7{
	static void fun() {
		System.out.println("In Demo Fun");
	}
}
class DemoChild07 implements Demo7{
	
}
public class Client06 {

	public static void main(String[] args) {
//		Demo7 obj = new DemoChild07();
		Demo7.fun();
	}
}
