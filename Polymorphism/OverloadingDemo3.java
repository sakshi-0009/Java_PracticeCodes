package Polymorphism;

class Demo1{
	void fun(int x, float y) {
		System.out.println("Integer-Float Parameter");
	}
	void fun(float x, int y) {
		System.out.println("Float-Integer Parameter");
	}
}

class OverloadingDemo3 {

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.fun(10.5f,10);
		obj.fun(10,10.5f);
//		obj.fun(10, 10);		Error: The method fun(int, float) is ambiguous for the type Demo1
	}
}
