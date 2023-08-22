package Polymorphism;

class Demo2{
	void fun(String str) {
		System.out.println("String");
	}
	void fun(StringBuffer str) {
		System.out.println("StringBuffer");
	}
}
class OverloadingDemo4 {

	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		obj.fun("Core2Web");
		obj.fun(new StringBuffer("C2W"));
//		obj.fun(null); 		Error: The method fun(String) is ambiguous for the type Demo
		
	}
}
