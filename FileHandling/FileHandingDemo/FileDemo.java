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
		
		System.out.println(fobj1.getName());
		System.out.println(fobj2.getName());
		
		System.out.println(fobj1.getParent());
		System.out.println(fobj2.getName());
		
		System.out.println(fobj1.getPath());
		System.out.println(fobj2.getPath());
		
		System.out.println(fobj2.getAbsolutePath());
		System.out.println(fobj2.getCanonicalPath());
		
		System.out.println(fobj2.canExecute());
		System.out.println(fobj2.canRead());
		System.out.println(fobj2.canWrite());
		
		System.out.println(fobj2.isDirectory());
		System.out.println(fobj2.isFile());
		System.out.println(fobj2.isHidden());
		
		System.out.println(fobj2.lastModified());
		System.out.println(fobj2.length());
		System.out.println(fobj2.compareTo(fobj1));

	}
}
