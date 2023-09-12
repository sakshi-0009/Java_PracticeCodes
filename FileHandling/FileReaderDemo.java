package FileHandling;
import java.io.*;
public class FileReaderDemo {

	public static void main(String[] args) throws IOException{
		File f = new File("Code.txt");
		FileReader fr = new FileReader(f);
		int data = fr.read();
		while(data != -1) {
			System.out.print((char)data);
			data  = fr.read();
		}
		fr.close();
		
	}
}
