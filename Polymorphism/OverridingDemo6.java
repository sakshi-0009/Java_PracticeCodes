package Polymorphism;

class Parent6{
	static void fun() {
		System.out.println("In parent fun()");
	}
}
class Child6 extends Parent6{
	static void fun() {
		System.out.println("In Child fun()");
	}
}
public class OverridingDemo6 {

	public static void main(String[] args) {
		
		Parent6 obj1 = new Parent6();
		obj1.fun();
		
		Child6 obj2 = new Child6();
		obj2.fun();
		
		Parent6 obj3 = new Child6();
		obj3.fun();
	}
}
