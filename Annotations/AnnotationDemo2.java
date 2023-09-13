package Annotations;

class Parent2{
	@Deprecated
	void m1() {
		System.out.println("Parent-m1");
	}
}
public class AnnotationDemo2 {
	@SuppressWarnings("Hello")
	public static void main(String[] args) {
		Parent2 p = new Parent2();
		p.m1();
	}
}
