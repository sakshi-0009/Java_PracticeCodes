//real time Exception:-

package ExceptionHandling;

import java.util.Scanner;

class LowMarksException extends RuntimeException{
	LowMarksException(String msg){
			super(msg);
	}
}
class HighMarksException extends RuntimeException{
	HighMarksException(String msg){
			super(msg);
	}
}
public class Client10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter Marks: ");
		System.out.println("0<marks<100");
		
		for(int i=0; i<arr.length; i++) {
			int Marks = sc.nextInt();
			if(Marks<0) {
				throw new LowMarksException("Marks are less than zero");
			}
			if(Marks>100) {
				throw new HighMarksException("Marks are more than 100");
			}
			arr[i] = Marks;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
