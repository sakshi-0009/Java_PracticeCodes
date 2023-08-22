package Inheritance;
class BCCI {

	BCCI(){
		System.out.println("In BCCI Constructor");
	}
	void BCCIDemo() {
		System.out.println("Board of Control for Cricket in India");
	}
}
class IPL extends BCCI{

	IPL(){
		System.out.println("In IPL Constructor");
	}
	void IPLDemo() {
		System.out.println("Indian Premier League");
	}
}

class Client02 {

	public static void main(String[] args) {
		BCCI obj = new IPL();
		obj.BCCIDemo();
		
	}
}
