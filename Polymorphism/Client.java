package Polymorphism;
class Superclass {

	int x = 10;
	static int y = 20;
	Superclass(){
		System.out.println("In Parent Constructor");
	}
}
class Subclass extends Superclass{

	int x = 100;
	static int y = 200;
	Subclass(){
		System.out.println("In Child Constructor");
	}
	void Access() {
		
		System.out.println(super.x);
		System.out.println(super.y);
		System.out.println(this.x);
		System.out.println(this.y);
	}
}
class Client {

	public static void main(String[] args) {
		Subclass obj = new Subclass();
		obj.Access();
	}
}
