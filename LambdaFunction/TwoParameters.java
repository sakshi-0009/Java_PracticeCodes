package LambdaFunction;

interface Core2Web3{
	String Company(String com1, String com2);
}

public class TwoParameters {

	public static void main(String[] args) {
		String name1 = "Biencaps";
        String name2 = "Incubator";
		Core2Web3 c2w = (obj1,obj2)->{
			return obj1+" & "+obj2+" By Shashi Sir"; 
		};
		System.out.println(c2w.Company(name1, name2));
	}
}
