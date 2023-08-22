package StringBuffer;

import java.io.*;

public class StringBufDemo3 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		String str1 = br.readLine();
		StringBuffer str2 = new StringBuffer(str1);
		str2.append("0009");
		System.out.println(str1);
	}
}
