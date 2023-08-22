//User Defined Exception:-

package ExceptionHandling;

import java.util.*;

class DataOverFlowException extends RuntimeException{
	DataOverFlowException(String msg){
			super(msg);
	}
}
class DataUnderFlowException extends RuntimeException{
	DataUnderFlowException(String msg){
			super(msg);
	}
}

public class Client09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter Integer value: ");
		System.out.println("0<value<100");
		
		for(int i=0; i<arr.length; i++) {
			int data = sc.nextInt();
			if(data<0) {
				throw new DataUnderFlowException("Value is less than zero");
			}
			if(data>100) {
				throw new DataOverFlowException("Value is more than 100");
			}
			arr[i] = data;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
