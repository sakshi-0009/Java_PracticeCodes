package FileHandling;
import java.io.*;
public class FileDescriptorDemo {

	public static void main(String[] args) throws IOException{
		 FileInputStream fis = new FileInputStream("Code.txt");
		 FileDescriptor fd = fis.getFD();
		 FileReader fr = new FileReader(fd);
		 int data = fr.read();
		 while(data != -1) {
			 System.out.print((char)data);
			 data  = fr.read();
		 }
		 fr.close();
	}
}
