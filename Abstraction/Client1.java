package Abstraction;

abstract class Parent{
	void fun() {
		System.out.println("Fun method");
	}
	abstract void gun();
}

class Child extends Parent {
	void gun() {
		System.out.println("Gun method");
	}
}

class Client1 {

	public static void main(String[] args) {
		Parent obj = new Child();
		obj.fun();
		obj.gun();
	}
}
