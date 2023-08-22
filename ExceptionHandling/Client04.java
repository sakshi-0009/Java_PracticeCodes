//NumberFOrmatException:-

package ExceptionHandling;

import java.io.*;

public class Client04 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter String: ");
		String str = br.readLine();
		System.out.println(str);
		
		int data = 0;
		try {
			System.out.println("Enter Integer: ");
			data = Integer.parseInt(br.readLine());
		}catch(NumberFormatException e) {
			System.out.println("Please enter valid Integer");
			data = Integer.parseInt(br.readLine());
		}
		System.out.println(data);
		
	}
}
