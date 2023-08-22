package InnerClass;

class Outer2{
	void m1() {
		System.out.println("In m1-Outer");
	}
	static class Inner{
		void m2() {
			System.out.println("In m1 Inner");
		}
	}
}

public class Client03 {

	public static void main(String[] args) {
		Outer2 obj1 = new Outer2();
		obj1.m1();
		
		Outer2.Inner obj = new Outer2.Inner();
		obj.m2();
	}
}
