package Polymorphism;

class Parent4{
	Object fun() {
		Object obj = new Object();
		System.out.println("Parent Method");
		return obj;
	}
}
class Child4 extends Parent4{
	String fun() {
		System.out.println("Child-Method");
		return "Sakshi";
	}
}
class OverridingDemo4 {

	public static void main(String[] args) {
		Parent4 obj = new Child4();
		obj.fun();
	}
}
