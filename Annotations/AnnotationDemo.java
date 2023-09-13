package Annotations;

class Parent{
	Parent(){
		System.out.println("In Parent Costructor");
	}
	void m1() {
		System.out.println("Parent-m1");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("In Child Constructor");
	}
	//@Override
	void m1(int x) {
		System.out.println("Child-m1");
	}
}
public class AnnotationDemo {

	public static void main(String[] args) {
		Parent p = new Child();
		p.m1();
	}
}
