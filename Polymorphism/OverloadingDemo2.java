package Polymorphism;

class Demo{
	void fun(int x) {
		System.out.println("Integer Parameter");
	}
	void fun(float x) {
		System.out.println("Float Parameter");
	}
}

class OverloadingDemo2 {

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.fun(10.5f);
		obj.fun(10);
//		obj.fun(10.5); 			Error: The method fun(int) in the type Demo is not applicable for the arguments (double)
	}
}

