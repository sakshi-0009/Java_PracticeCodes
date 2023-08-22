// Method Local Inner Class 

package InnerClass;

class Outer1{
	void m1() {
		System.out.println("In m1 Outer");
		class Inner{
			void m1() {
				System.out.println("In m1-Inner");
			}
		}
		Inner obj1 = new Inner();
		obj1.m1();
	}
	void m2() {
		System.out.println("In Outer-m2");
	}
}

public class Client02 {

	public static void main(String[] args) {
		Outer1 obj = new Outer1();
		obj.m1();
		obj.m2();
	}
}
