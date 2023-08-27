package LambdaFunction;

interface Core2Web{
	String lang();
}

public class ZeroParameter {

	public static void main(String[] args) {
		
		Core2Web c2w = ()->{
			return ("Boothcamp/Java/Flutter");
		};
		System.out.println(c2w.lang());
	}
}
/*interface Core2Web{
	void lang();
}

public class ZeroParameter {

	public static void main(String[] args) {
		
		Core2Web c2w = ()->{
			System.out.println("Boothcamp/Java/Flutter");
		};
		c2w.lang();
	}
}*/

/*public class ZeroParameter {

	public static void main(String[] args) {
		
		Core2Web c2w = ()-> System.out.println("Boothcamp/Java/Flutter");
		c2w.lang();
	}
}*/

