package Constructor;

public class Demo1 {

	Demo1(){
		System.out.println("Inside Constructor");
	}
	void fun() {
		Demo1 obj = new Demo1();
	}
	public static void main(String[] args) {
		Demo1 obj1 = new Demo1();
		Demo1 obj2 = new Demo1();
		obj1.fun();
	}
}
