package Polymorphism;

class Parent3{
	int fun() {
		System.out.println("Parent Method");
		return 10;
	}
}
class Child3 extends Parent3{
	int fun() {
		System.out.println("Child-Method");
		return 10;
	}
}
class OverridingDemo3 {
	
	public static void main(String[] args) {
		Parent3 obj = new Child3();
		obj.fun();
	}
}
