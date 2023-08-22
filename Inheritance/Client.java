package Inheritance;

class SupremeCourt {

	SupremeCourt(){
		System.out.println(this);
		System.out.println("In Supreme Court Constructor");
	}
	void Court() {
		System.out.println("Supreme Court of India");
	}
}
class HighCourt extends SupremeCourt {
	HighCourt(){
		System.out.println(this);
		System.out.println("In High Court Constructor");
	}
}
class Client {

	public static void main(String[] args) {
		SupremeCourt obj1 = new SupremeCourt();
		HighCourt obj = new HighCourt();
		obj.Court();
	}
}
