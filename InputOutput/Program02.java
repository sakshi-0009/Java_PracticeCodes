/*//Exception in thread 'main' java.io.IOException:Stream Closed 

package InputOutput;

import java.io.*;

public class Program02 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name : ");
		String str1 = br.readLine();
		br.close();
		System.out.println("Enter your Surname : ");
		String str2 = br.readLine();
		
		System.out.println(str1+""+str2);
	}

}*/
