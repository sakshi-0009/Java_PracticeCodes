package FileHandling.FileHandingDemo;

import java.io.*;

public class FileDemo {

	public static void main(String[] args) throws IOException{
		int count = 0;
		File fobj1 = new File("FileHandingDemo");
		fobj1.mkdir();
		
		File fobj2 = new File("Code.txt");
		fobj2.createNewFile();
		
		System.out.println(fobj1.exists());
		String[] files = fobj1.list();
		for(String str : files) {
			System.out.println(str);
			count++;
		}
		System.out.println(count);
		for(String str : files) {
			File f = new File(str);
			if(f.isFile()) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
