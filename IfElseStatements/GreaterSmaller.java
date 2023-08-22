package IfElseStatements;

public class GreaterSmaller {

	public static void main(String[] args) {
		int var = 15;
		if(var < 10) {
			System.out.println(var+" is less than 10");
		}
		else if(var > 10) {
			System.out.println(var+" is greater than 10");
		}
		else {
			System.out.println(var+" is equal to 10");
		}
	}
}
