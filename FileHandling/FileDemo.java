package FileHandling;

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
		
		System.out.println(fobj1.getName()); 		//FileHandingDemo
		System.out.println(fobj2.getName()); 		//Code.txt

		System.out.println(fobj1.getParent()); 		//null
		System.out.println(fobj2.getName()); 		//code.txt
		
		System.out.println(fobj1.getPath()); 		//FilehandlingDemo
		System.out.println(fobj2.getPath()); 		//Code.txt
		
		System.out.println(fobj2.getAbsolutePath()); //C:\Users\User\eclipse-workspace\03_PracticeCodes\Code.txt
		System.out.println(fobj2.getCanonicalPath()); //C:\Users\User\eclipse-workspace\03_PracticeCodes\Code.txt
		
		System.out.println(fobj2.canExecute());		//true
		System.out.println(fobj2.canRead());		//true
		System.out.println(fobj2.canWrite());		//true
		
		System.out.println(fobj2.isDirectory()); 	//false
		System.out.println(fobj2.isFile()); 		//true
		System.out.println(fobj2.isHidden()); 		//false
		
		System.out.println(fobj2.lastModified()); 	//1694430787287
		System.out.println(fobj2.length());  		//18
		System.out.println(fobj2.compareTo(fobj1)); //-3

	}
}
