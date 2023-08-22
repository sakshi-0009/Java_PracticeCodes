// Normal Inner Class

package InnerClass;

class Outer{
	class Inner{
		void m1() {
			System.out.println("In m1-Inner");
		}
	}
	void m2() {
		System.out.println("In m2-Outer");
	}
}

public class Client01 {

	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.m2();
		
		Outer.Inner obj1 = obj.new Inner();
		obj1.m1();
		
		Outer.Inner obj2 = new Outer().new Inner();
		obj2.m1();
	}
}
/*
class Outer{
	class Inner{
		void m1() {
			System.out.println("In m1-Inner");
		}
	}
	void m2() {
		System.out.println("In m2-Outer");
	}
	public static void main(Stirng [] args){
		Outer obj1 = new Outer();
		obj1.m2();
	
		Inner obj2 = new Outer().new Inner();
		obj.m1();
	}
	
}
*/



