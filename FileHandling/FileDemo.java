package FileHandling;
import java.io.*;
public class FileDemo {

	public static void main(String[] args) throws IOException{
		File fobj1 = new File("FileHandingDemo");
		fobj1.canExecute();
		fobj1.canRead();
		fobj1.canWrite();
		fobj1.mkdir();
		
		File fobj2 = new File("Code.txt");
		fobj2.createNewFile();
	}
}
