package Inheritance;
class Parent {

	int x = 10;
	static int y = 20;
	static{
		System.out.println("In Parent Static Block");
	}
	Parent(){
		System.out.println(this);
		System.out.println("In Parent Constructor");
	}
	void methodOne() {
		System.out.println(x);
		System.out.println(y);
	}
	static void methodTwo() {
		System.out.println(y);
	}
}

class Child extends Parent{

	static {
		System.out.println("In Child Static Block");
		System.out.println(y);
		methodTwo();
	}
	Child(){
		System.out.println(this);
		System.out.println("In Child Constructor");
	}
}

class Client03 {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.methodOne();
		obj.methodTwo();
	}
}
