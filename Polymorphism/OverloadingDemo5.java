package Polymorphism;

class Demo3{
	void fun(Object obj) {
		System.out.println("Object");
	}
	void fun(String str) {
		System.out.println("String");
	}
}
class OverloadingDemo5 {

	public static void main(String[] args) {
		Demo3 obj = new Demo3();
		obj.fun("Core2Web");
		obj.fun(new StringBuffer("C2W"));
		obj.fun(null);
	}
}
