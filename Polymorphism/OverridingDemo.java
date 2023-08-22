package Polymorphism;

class Parent {
	Parent(){
		System.out.println("In Parent Constructor");
	}
	void fun(int x) {
		System.out.println("In parent Fun");
	}
}
class Child extends Parent {
	Child(){
		System.out.println("In Child Constructor");
	}
	void fun() {
		System.out.println("In Child Fun");
	}
}
class OverridingDemo {

	public static void main(String[] args) {
		Parent obj = new Child();
		obj.fun(10);
	}
}
