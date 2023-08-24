package Static;

public class This01 {

	int x = 10;
	This01(){
		System.out.println("In no-args constructor");
	}
	This01(int x){
		System.out.println("In para constructor");
	}
	public static void main(String[] args) {
		This01 obj1 = new This01();
		This01 obj2 = new This01(10 );
	}
}
