package Static;

public class Demo {

	int x = 10;
	static int y = 20;
	
	static {
		System.out.println("Static block 1");
//		System.exit(0);
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.exit(0);
	}
	static {
		System.out.println("Static block 2");
//		System.exit(0);
	}
}
