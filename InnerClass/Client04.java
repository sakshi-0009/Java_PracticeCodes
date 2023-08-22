package InnerClass;

class Demo{
	void marry() {
		System.out.println("XYZ");
	}
}

public class Client04 {

	public static void main(String[] args) {
		Demo obj = new Demo() {
			void marry() {
				System.out.println("PQR");
			}
		};
		obj.marry();
	}
}
