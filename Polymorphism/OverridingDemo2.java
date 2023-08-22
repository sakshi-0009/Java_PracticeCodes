package Polymorphism;
class Parent1 {
	Parent1(){
		System.out.println("In Parent Constructor");
	}
	void fun(int x) {
		System.out.println("In parent Fun");
	}
}
class Child1 extends Parent1 {
	Child1(){
		System.out.println("In Child Constructor");
	}
	void fun(int x) {
		System.out.println("In Child Fun");
	}
}
class OverridingDemo2 {

	public static void main(String[] args) {
		Parent1 obj = new Child1();
		obj.fun(10);
	}
}
