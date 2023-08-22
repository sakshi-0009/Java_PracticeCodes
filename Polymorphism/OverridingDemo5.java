package Polymorphism;

class Parent5{
	void fun() {
		System.out.println("In parent fun()");
	}
}
class Child5 extends Parent5{
	public void fun() {
		System.out.println("In Child fun()");
	}
}
public class OverridingDemo5 {

	public static void main(String[] args) {
		Parent5 obj = new Child5();
		obj.fun();
	}
}
