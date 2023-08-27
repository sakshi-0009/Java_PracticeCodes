package LambdaFunction;

interface Core2Web1{
	String Lang(int courses);
}

public class OneParameter {

	public static void main(String[] args) {
		Core2Web1 c2w = (int course)->{
			return "Bootcamp/Java/Dart : "+course;
		};
		System.out.println(c2w.Lang(3));
	}
}
