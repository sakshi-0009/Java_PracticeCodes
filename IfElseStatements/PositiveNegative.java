package IfElseStatements;

public class PositiveNegative {
	
	public static void main(String[] args) {
		int var = 0;
		if(var > 0) {
			System.out.println(var+" is positive");
		}
		else if(var < 0) {
			System.out.println(var+" is Negative");
		}
		else {
			System.out.println(var+" is neutral");
		}
	}

}
