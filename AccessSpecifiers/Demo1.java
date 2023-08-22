package AccessSpecifiers;

public class Demo1 {

	public int x = 10;
	
	void disp() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		System.out.println(obj.x);
	}
}
