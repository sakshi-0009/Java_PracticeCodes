package Abstraction;

abstract class Government {
	void Fund() {
		System.out.println("Government Fund");
	}
	abstract void FundDist();
}
class States extends Government{
	void FundDist() {
		System.out.println("Fund Distribution");
	}
}
public class Client2 {

	public static void main(String[] args) {
		Government obj = new States();
		obj.Fund();
		obj.FundDist();
	}
}
